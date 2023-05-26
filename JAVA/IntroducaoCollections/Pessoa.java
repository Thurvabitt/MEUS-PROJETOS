package IntroducaoCollections;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private String cpf;
	private String dataNascimento;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cpf, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

public String toString() {
	return "\nnome: " + nome + "\nCpf: " + cpf + "\nData de nascimento: " + dataNascimento + "\n";
}


@Override
public int compareTo(Pessoa o) {
	return this.nome.compareTo(o.nome);
}


//compare to: -1 = menor; 0 = igual; 1 = maior






















}
