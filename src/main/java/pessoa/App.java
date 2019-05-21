package pessoa;

public class App {
	
	public static void main(String[] args) {
		Fisica wilsonMatos = new Fisica("Wilson Matos", "5.555.555-1", "016.766.655-44");
		Fisica claudioFerdinandi = new Fisica("Cl�udio Ferdinandi", "7.555.555-6", "888.766.655-22");
		Fisica arthurZavadski = new Fisica("Arthur Zavadski", "7.333.555-2", "557.333.655-11");
		
		Juridica uniCesumar = new Juridica("UniCesumar - Centro Universit�rio de Maring�", "01.444.555/0001-22", 1000000.00);
		uniCesumar.adicionarSocio(wilsonMatos, 60.00);
		uniCesumar.adicionarSocio(claudioFerdinandi, 39.00);
		uniCesumar.adicionarSocio(arthurZavadski, 1.00);
		
		uniCesumar.removerSocio(arthurZavadski);
		
		System.out.println("Foi.");
	}

}
