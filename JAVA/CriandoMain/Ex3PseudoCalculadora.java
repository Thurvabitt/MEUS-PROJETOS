package CriandoMain;

public class Ex3PseudoCalculadora {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int num) {
		x = num;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int num) {
		y = num;
	}
	
	public int soma() {
		return x + y;
	}
	
	public int  subtracao() {
		return x - y;
	}
	
	public int multiplicacao() {
		return x * y;
	}
	
	public int divisao() {
		if(y == 0) {
			return -1;
		}else {
			return x / y;
		}
	}
}
