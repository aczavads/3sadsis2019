package aula20190315.calculadora;

// 1º modificador de acesso (public, private, protected todos com ou sem static)
// 2º tipo de retorno(void (sem retorno) ou um tipo qualquer: int, long,
// boolean, Elefante, String, etc...)
// 3º nome do método
// 4º lista de parâmetros entre parênteses
// 5º corpo do método: { ... }

public class Calculadora {
	//- memoria : double
	private double memoria;
	//- ultimoResultado : double
	private double ultimoResultado;	

	// + somar(v1 : double, v2 : double) : double
	public double somar(double v1, double v2) {
		ultimoResultado = v1 + v2;
		return ultimoResultado;
	}
	// + subtrair(v1 : double, v2 : double) : double
	public double subtrair(double v1, double v2) {
		ultimoResultado = v1 - v2;
		return ultimoResultado;
	}
	// + dividir(dividendo : double, divisor : double) : double
	public double dividir(double dividendo, double divisor) {
		ultimoResultado = dividendo / divisor; 
		return ultimoResultado;
	}
	// + multiplicar(v1 : double, v2 : double) : double
	public double multiplicar(double v1, double v2) {
		ultimoResultado = v1 * v2;
		return ultimoResultado;
	}
	public void memorizar() {
		memoria = ultimoResultado;
	}
	public double obterValorDaMemoria() {
		return memoria;
	}
}
