package IntroduçãoAoThrow_e_Exercicios;

public class ParImpar extends ExcecaoParImpar{
	private int numero;
	

	public ParImpar() {
		
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void verificaParImpar() {
		try {
		if(numero % 2 == 0) {
			System.out.println("O número é par!");
		}else {
			throw new ExcecaoParImpar(numero);
		}
	}
	
	catch(ExcecaoParImpar p) {
		System.out.println("To String: " + p.toString());
		System.out.println("Get Message: " + p.getMessage());
	}
}
	
	public void verificaParImpar2() throws ExcecaoParImpar{
		if(numero % 2 == 0) {
			System.out.println("O número é par!");
		}
		
		else {
			throw new ExcecaoParImpar(numero);
	}	
  }
}
