package aula20190405.lista.oo;

public class App {
	
	
	public static void main(String[] args) {
		Cor azul = new Cor(1, "Azul");
		Cor lilás = new Cor(2,"Lilás");
		
		ListaDeCor listaCompleta = new ListaDeCor();
		ListaDeCor listaParcial = new ListaDeCor();
		
		//inserirCor(azul, listaCompleta);
		//inserirCor(lilás, listaCompleta);
		
		listaCompleta.inserirCor(azul);
		listaCompleta.inserirCor(lilás);
		
		//listaComplesta.cores = new Cor[0];
		
		listaParcial.inserirCor(lilás);
		
		System.out.println("O tamanho da COMPLETA é: " + listaCompleta.getTamanho());
		System.out.println("O tamanho da PARCIAL é: " + listaParcial.getTamanho());
		
		listaCompleta.listarCores();
		listaParcial.listarCores();
		
	}

}



