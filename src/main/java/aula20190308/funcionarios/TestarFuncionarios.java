package aula20190308.funcionarios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestarFuncionarios {
	public static Funcionario[] funcionarios = {
			new Funcionario("Beatriz",5800.35),
			new Funcionario("Ana", 7200.12),
			new Funcionario("Roberto", 4825.33)
	};

	
	@Test
	void testarFuncionarioComMaiorSalario() {
		Funcionario maior = recuperarFuncionarioComMaiorSalario(funcionarios);
		
		assertEquals("Ana", maior.nome);
		assertEquals(7200.12, maior.salario, 0.0);
	}
	
//	public static Funcionario recuperarFuncionarioComMaiorSalario(Funcionario[] funcionarios) {
//		return new Funcionario("fulano", 1.00);
//	}
	
	@Test
	void testarSomaDeUmMaisDois() {
		int valor1 = 1;
		int valor2 = 2;
		//int soma = valor1 + valor2;
		int soma = somar(valor1,valor2);
		
		assertEquals(3, soma);
	}
	
	public static int somar(int valor1, int valor2) {
		return valor1 + valor2;
	}

}
