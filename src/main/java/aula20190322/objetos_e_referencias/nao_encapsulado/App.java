package aula20190322.objetos_e_referencias.nao_encapsulado;

public class App {
	
	public static void main(String[] args) {
		Carro meuCarro = new Carro();		
		Carro seuCarro = new Carro();
		Carro nossoCarro = meuCarro;
		
		System.out.println(meuCarro);
		System.out.println(seuCarro);
		System.out.println(nossoCarro);
		
		
//		if (seuCarro.combustivelEmLitros > 0.00) {
//			seuCarro.ligado = true;			
//		}
//		
//		if (nossoCarro.combustivelEmLitros > 0.00) {
//			nossoCarro.ligado = true;
//		}
		
		ligar(seuCarro);
		ligar(nossoCarro);
		
		meuCarro.combustivelEmLitros = 0.00;
		meuCarro.ligado = true;
		
		
	}
	
	public static void ligar(Carro c) {
		if (c.combustivelEmLitros > 0.00) {
			c.ligado = true;
		}
	}
}
