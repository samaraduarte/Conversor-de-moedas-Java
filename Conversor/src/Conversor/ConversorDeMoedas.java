package Conversor;

public class ConversorDeMoedas {

	public double realParaDolar(double valor) {
		return valor * 5.17;
	}
	
	public double realParaEuro(double valor) {
		return valor * 5.51;
	}
	
	public double realParaLibrasEsterlina(double valor) {
		return valor * 6.20;
	}
	
	public double realParaPesoArgentino(double valor) {
		return valor * 0.026;
	}
	
	public double realParaPesoChileno(double valor) {
		return valor * 0.0065;
	}
	
	public double dolarParaReal(double valor) {
		return valor / 5.17;
	}
	
	public double euroParaReal(double valor) {
		return valor / 5.51;
	}
	
	public double librasEsterlinasParaReal(double valor) {
		return valor / 6.20;
	}
	
	public double pesoArgentinoParaReal(double valor) {
		return valor / 0.026;
	}
	
	public double pesoChilenoParaReal(double valor) {
		return valor / 0.0065;
	}
	
}
