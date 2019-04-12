package aula20190412.lista_dinamica;

public class ListaDinamica {
	private Elemento primeiro;
	
	public void adicionar(Object valor) {
		Elemento novo = new Elemento(valor,null);
		if (this.primeiro == null) {
			this.primeiro = novo;
		} else {
			Elemento auxiliar = this.primeiro;
			while (auxiliar.getProximo() != null) {
				auxiliar = auxiliar.getProximo();
			}
			auxiliar.setProximo(novo);
		}
	}

}
