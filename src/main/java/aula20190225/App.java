package aula20190225;


public class App {
	
	public static void main(String[] argumentos) {
		System.out.println("O quadrado de 3 é: " + quadrado(3));
		System.out.println("O cubo de 3 é: " + cubo(3));
		
		int[] valores = {10,15,33,2,1,4,5,6};
		for (int contador = 0; contador < valores.length; contador++) {
			System.out.println("O quadrado de " + valores[contador] + " é: " + quadrado(valores[contador]));
			System.out.println("O cubo de " + valores[contador] + " é: " + cubo(valores[contador]));
		}
 	}
	
	public static int quadrado(int numero) {
		return numero * numero;
	}
		
	public static int cubo(int numero) {
		return numero * quadrado(numero);
	}
}
