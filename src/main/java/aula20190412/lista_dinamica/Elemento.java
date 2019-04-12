package aula20190412.lista_dinamica;

public class Elemento {
	private Object valor;
	private Elemento proximo;
	
	//Péssima escolha para nomes dos parâmetros! 
	//Só como exemplo do que NÃO se deve fazer.
	public Elemento(Object v, Elemento p) {
		this.valor = v;
		this.proximo = p;
	}
	public Object getValor() {
		return valor;
	}
	public Elemento getProximo() {
		return proximo;
	}
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

}
