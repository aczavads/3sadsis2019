package aula20190405.lista.oo;

public class Cor {
	private String nome;
	private int codigo;
	
	public Cor(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;		
	}
	
	//Método de acesso/obtenção: não altera o estado do objeto! 
	public String getNome() {
		return this.nome;
	}
	//Método de acesso/obtenção: não altera o estado do objeto! 
	public int getCodigo() {
		return this.codigo;
	}

}
