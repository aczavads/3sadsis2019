package aula20190412.lista_generica;

public class App /*extends Object*/ {
	
	public static void main(String[] args) {
		//Neste primeiro caso, a lista aceitará qualquer objeto, pois trabalhamos com Object.
		ListaGenerica lista = new ListaGenerica();
		lista.inserir("Amanda");
		lista.inserir("Josias");
		lista.inserir(55L);
		lista.inserir(new Mago());
		
		//parametrizando a ListaGenerica para aceitar somente String.
		ListaGenerica<String> nomes = new ListaGenerica<String>();
		nomes.inserir("Adolfo");
		nomes.inserir("Ana Beatriz");
		nomes.inserir("Heitor");
		nomes.inserir(new Mago());
		
	}

}
