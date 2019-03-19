package aula20190318.testesLogicos;

public class App {
	
	public static void main(String[] args) {
		if (true) {
			System.out.println("Primeira linha");
		}
		if (1 == 1) {
			System.out.println("Segunda linha");
		}
		boolean teste = 1 == 1;
		if (teste) {
			System.out.println("Terceira linha");
		}
		if (hojeEhSegunda()) {
			System.out.println("Quarta linha");
		}
	}
	public static boolean hojeEhSegunda() {
		return true;
	}

}
