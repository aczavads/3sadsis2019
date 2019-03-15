package aula20190315.calculadora;

public class App {
	
	public static void main(String[] args) {
		Calculadora minha = new Calculadora();		
		
		double soma = minha.somar(10, 30);
		System.out.println("A soma é: " + soma);
		
		minha.memorizar();
		System.out.println(minha.obterValorDaMemoria());
		
		System.out.println("A subtração é: " + minha.subtrair(20, 3));
		System.out.println("A divisão é: " + minha.dividir(20, 3));
		System.out.println("A multiplicação é: " + minha.multiplicar(20, 3));
	}

}
