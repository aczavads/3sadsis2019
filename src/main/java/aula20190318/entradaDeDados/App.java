package aula20190318.entradaDeDados;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String linhaLida = "";
		while (!linhaLida.equals("sair")) {
			System.out.print("Digite alguma coisa ('sair' para sair): ");
			linhaLida = leitor.nextLine();
			System.out.println(linhaLida);
		}
		
//		boolean continuar = true; 
//		do {
//			System.out.print("Digite alguma coisa ('sair' para sair): ");
//			String linhaLida = leitor.nextLine();
//			System.out.println(linhaLida);
//			continuar = !linhaLida.equals("sair");
//		} while (continuar);
		
		
		System.out.println("Saiu.");
	}
}
