package IntroduçãoAoThrow_e_Exercicios;

public class ExcecaoParImpar extends Exception{	
	public int num;
	
	public ExcecaoParImpar() {
		
	}
	
	public ExcecaoParImpar(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String toString() {
		return "O número " + num + " é impar!";
	}
	
	public String getMessage(){
		return "O número é impar!";
	} 
}
