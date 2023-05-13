package ExerciciosComExtendsEarraylists;

public class Ex2Pessoa {
	protected String nome;
	protected String endereco;
	protected String telefone;
	
	public Ex2Pessoa() {
		
	}
	
	public Ex2Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String toString() {
		return " Nome: " + nome + ",\n Endereço: " + endereco + "\n telefone: " + telefone + "]";
	}
	
	
	
}
