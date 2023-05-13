package ExerciciosComExtendsEarraylists;

public abstract class Ex1Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	
	public Ex1Funcionario() {
		
	}
	
	public Ex1Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	public abstract double bonificacao();
	
	public String toString() {
		return "nome=" + nome + "\n cpf=" + cpf + "\n salario=" + salario + "\n";
	}
	
	
	
	
}
