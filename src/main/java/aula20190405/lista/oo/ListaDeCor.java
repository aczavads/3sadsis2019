package aula20190405.lista.oo;

public class ListaDeCor {
	private Cor[] cores = new Cor[0];
	private int tamanho = 0;
	
	
	public void inserirCor(Cor cor) {
		Cor[] novoArray = new Cor[tamanho+1];
		for (int contador = 0; contador < tamanho; contador++) {
			Cor atual = cores[contador];
			novoArray[contador] = atual;
		}
		novoArray[tamanho] = cor;
		tamanho++;
		this.cores = novoArray;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public void listarCores() {
		System.out.println("Listando cores...");
		for (Cor corDaVez: this.cores) {
			System.out.println(corDaVez.getCodigo() + " " + corDaVez.getNome());
		}
	}

}

