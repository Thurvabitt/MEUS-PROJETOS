package IntroduçãoHerança;

public class Ex2Assalariado extends Ex2Empregado {
	private double salario;
	
	public Ex2Assalariado() {
		
	}
	
	public Ex2Assalariado(String nome, String cpf, String setor, double salario) {
		super(nome, cpf, setor);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String toString() {
		return super.toString() + "\n" + "Salário: " + salario + "\n";
	}
	
	

	
	
}
