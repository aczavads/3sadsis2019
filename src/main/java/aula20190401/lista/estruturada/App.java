package aula20190401.lista.estruturada;

public class App {
	
	public static void main(String[] args) {
		Cor azul = new Cor();
		azul.codigo = 1;
		azul.nome = "Azul";
		
		Cor lilás = new Cor();
		lilás.codigo = 2;
		lilás.nome = "Lilás";
		
		ListaDeCor listaCompleta = new ListaDeCor();
		ListaDeCor listaParcial = new ListaDeCor();
		
		inserirCor(azul, listaCompleta);
		inserirCor(lilás, listaCompleta);
		
		listaCompleta.cores = new Cor[0];
		
		inserirCor(lilás, listaParcial);
						
		System.out.println("Tamanho da lista completa= " + listaCompleta.tamanho);
		System.out.println("Tamanho da lista parcial= " + listaParcial.tamanho);
		
		listarCores("COMPLETA",listaCompleta);
		listarCores("PARCIAL", listaParcial);

		System.out.println("Foi.");
	}	
	public static void inserirCor(Cor cor, ListaDeCor lista) {
		Cor[] novoArray = new Cor[lista.tamanho+1];
		for (int contador = 0; contador < lista.tamanho; contador++) {
			novoArray[contador] = lista.cores[contador];
		}
		novoArray[lista.tamanho] = cor;
		lista.tamanho = lista.tamanho + 1; //lista.tamanho++
		lista.cores = novoArray;
	}
	public static void listarCores(String nomeDaLista, ListaDeCor lista) {
		System.out.println("Listando cores da lista " + nomeDaLista);
		for (int contador = 0; contador < lista.tamanho; contador++) {
			System.out.println(lista.cores[contador].codigo + " // " + lista.cores[contador].nome);
		}
	}
	
	
    
}


