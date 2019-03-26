package aula20190325.cofre;

public class App {

	public static void main(String[] args) {
		Cofre apto503 = new Cofre();		
		System.out.println("Cofre do apto 503: " + apto503.isAberto());
		
		apto503.fechar(1234);
		System.out.println("Cofre do apto 503: " + apto503.isAberto());
		
		apto503.fechar(1234);
		System.out.println("Cofre do apto 503: " + apto503.isAberto());
		
		apto503.abrir(1234);
		System.out.println("Cofre do apto 503: " + apto503.isAberto());
	}

}
