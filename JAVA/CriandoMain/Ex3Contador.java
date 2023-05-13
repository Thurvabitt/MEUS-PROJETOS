package CriandoMain;

public class Ex3Contador {
	private int numero = 0;
	
	public Ex3Contador() {
	}
	
	public Ex3Contador(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int zerar() {
		numero = 0;
		return numero;
	}
	
	public int incrementar() {
		return numero++;
	}
	
	public int decrementar() {
		numero--;
		return numero;
	}
	
	public int somar(int valor) {
		numero += valor;
		return valor;
	}
	
	public int subtrair(int valor) {
		numero -= valor;
		return numero;
	}
}
