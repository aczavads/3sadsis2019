package pessoa;

import pessoa.Juridica.CotaSociedade;

public class App {
	
	public static void main(String[] args) {
		Pessoa wilsonMatos = new Fisica("Wilson Matos", "5.555.555-1", "016.766.655-44");
		Pessoa claudioFerdinandi = new Fisica("Cláudio Ferdinandi", "7.555.555-6", "888.766.655-22");
		Pessoa arthurZavadski = new Fisica("Arthur Zavadski", "7.333.555-2", "557.333.655-11");
		
		Juridica uniCesumar = new Juridica("UniCesumar - Centro Universitário de Maringá", "01.444.555/0001-22", 1000000.00);
		uniCesumar.adicionarSocio(wilsonMatos, 90.00);
		uniCesumar.adicionarSocio(claudioFerdinandi, 39.00);
		uniCesumar.adicionarSocio(arthurZavadski, 1.00);
		uniCesumar.adicionarSocio(arthurZavadski, 1.00);
		uniCesumar.adicionarSocio(arthurZavadski, 1.00);
		uniCesumar.adicionarSocio(arthurZavadski, 1.00);
		uniCesumar.adicionarSocio(arthurZavadski, 1.00);
		
		//uniCesumar.removerSocio(arthurZavadski);
		
		for (CotaSociedade cota : uniCesumar.getCotasSociedade()) {
			System.out.println(cota.getSocio().getNome() + "=" + cota.getPercentualDeParticipacao());
		}
		
		System.out.println("Foi.");
	}

}
