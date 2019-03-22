package aula20190322.objetos_e_referencias.encapsulado;

public class App {
	
	public static void main(String[] args) {
		Carro meuCarro = new Carro();		
		Carro seuCarro = new Carro();
		Carro ogroMóvel = meuCarro;
		
		System.out.println(meuCarro);
		System.out.println(seuCarro);
		System.out.println(ogroMóvel);
		
		meuCarro.abastecer(10.5);
		meuCarro.abastecer(30.5);
		
		meuCarro.ligar();
		
		System.out.println(meuCarro.isLigado());
		System.out.println(seuCarro.isLigado());
		System.out.println(ogroMóvel.isLigado());
	}	
}
