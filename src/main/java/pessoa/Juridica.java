package pessoa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Juridica extends Pessoa {
	private String cnpj;
	private double capitalSocial;
	private Set<CotaSociedade> cotasSociedade = new HashSet<CotaSociedade>();

	public Juridica(String nome, String cnpj, double capitalSocial) {
		super(nome);
		this.cnpj = cnpj;
		this.capitalSocial = capitalSocial;
	}

	public Juridica(UUID id, String nome, String cnpj, double capitalSocial) {
		super(id, nome);
		this.cnpj = cnpj;
		this.capitalSocial = capitalSocial;
	}

	public void adicionarSocio(Pessoa socio, double percentualDeParticipacao) {
		CotaSociedade cotaNova = new CotaSociedade();
		cotaNova.percentualDeParticipacao = percentualDeParticipacao;
		cotaNova.socio = socio;
		/*
		 * for (CotaSociedade cotaAtual : this.cotasSociedade) { if
		 * (cotaAtual.getSocio().equals(socio)) { return; } }
		 */
		this.cotasSociedade.add(cotaNova);
	}

	public void removerSocio(Pessoa socioParaRemover) {
		Set<CotaSociedade> novo = new HashSet<CotaSociedade>();
		for (CotaSociedade cotaSociedade : cotasSociedade) {
			if (!cotaSociedade.socio.equals(socioParaRemover)) {
				novo.add(cotaSociedade);
			}
		}
		this.cotasSociedade = novo;
	}

	public Set<CotaSociedade> getCotasSociedade() {
		return this.cotasSociedade;
	}

	public String getCnpj() {
		return cnpj;
	}

	public double getCapitalSocial() {
		return capitalSocial;
	}

	public static class CotaSociedade {
		private double percentualDeParticipacao;
		private Pessoa socio;

		public Pessoa getSocio() {
			return socio;
		}

		public double getPercentualDeParticipacao() {
			return percentualDeParticipacao;
		}

		public int hashCode() {
			return this.socio.hashCode();
		}

		@Override
		public boolean equals(Object other) {
			if (other == null) {
				return false;
			}
			if (!other.getClass().equals(this.getClass())) {
				return false;
			}
			CotaSociedade aux = (CotaSociedade) other;
			if (aux.getSocio().equals(this.getSocio())) {
				return true;
			}
			return false;
		}

	}

}
