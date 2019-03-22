package aula20190322.objetos_e_referencias.encapsulado;

public class Carro {
	private double combustivelEmLitros = 0.00;
	private boolean ligado = false;
	
	
	public void ligar() {
		if (temCombustivel()) {
			this.ligado = true;
		}
	}

	private boolean temCombustivel() {
		return this.combustivelEmLitros > 0.00;
	}
	
	public boolean isLigado() {
		return this.ligado;
	}
	
	public void abastecer(double quantidadeAbastecida) {
		this.combustivelEmLitros += quantidadeAbastecida;
	}


}
