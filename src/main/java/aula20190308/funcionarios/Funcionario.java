package aula20190308.funcionarios;

public class Funcionario {
	protected String nome;
	protected double salario;
	
	//construtor: permite criar objetos do tipo Funcionário 
	//passando o nome e o salário como parâmetros
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

}
