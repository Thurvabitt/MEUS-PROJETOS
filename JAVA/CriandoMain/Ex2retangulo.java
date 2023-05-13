package CriandoMain;

public class Ex2retangulo {
	
	private int lado1;
	private int lado2;
	
	public Ex2retangulo() {
		
	}
	
	public Ex2retangulo( int lado1, int lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public int getlado1() {
		return lado1;
	}
	
	public void setlado1(int lado1) {
		this.lado1 = lado1;
	}
	
	public int getlado2() {
		return lado2;
	}
	
	public void setlado2(int lado2) {
		this.lado2 = lado2;
	}
	
	public int calculaArea() {
		return lado1 * lado2;
	}
	
	public int calculaPerimetro() {
		return 2 * (lado1 + lado2);
	}
	
	
}
