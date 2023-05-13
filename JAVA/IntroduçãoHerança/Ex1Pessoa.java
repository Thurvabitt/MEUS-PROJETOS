package IntroduçãoHerança;

public class Ex1Pessoa {
	private String nome;
	private String cpf;
	private char sexo;
	
	public Ex1Pessoa() {
		
	}
	
	public Ex1Pessoa(String nome, String cpf, char sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	public String dadosPessoa() {
		String str = "Nome: " + nome + "\nCpf: " + cpf + "\nSexo: " + sexo + "\n";
		return str;
	}
	
	
}
