package pessoa;

import java.util.HashSet;
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
		CotaSociedade cota = new CotaSociedade();
		cota.percentualDeParticipacao = percentualDeParticipacao;
		cota.socio = socio;
		this.cotasSociedade.add(cota);
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

	public String getCnpj() {
		return cnpj;
	}

	public double getCapitalSocial() {
		return capitalSocial;
	}
	
	private class CotaSociedade {
		private double percentualDeParticipacao;
		private Pessoa socio;
		
	}

}



