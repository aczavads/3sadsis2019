package aula20190408.atributosDeClasseVersusInstancia;

public class Pessoa {
	private static String nome;
	private int idade;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, int idade) {
		int valor = 10;
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	
	

}
