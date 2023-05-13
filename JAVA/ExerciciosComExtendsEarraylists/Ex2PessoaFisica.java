package ExerciciosComExtendsEarraylists;

public class Ex2PessoaFisica extends Ex2PessoaAbstrata {
	private String cpf;
	
	public Ex2PessoaFisica() {
		
	}
	
	public Ex2PessoaFisica(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String toString() {
		return super.toString() + "CPF:" + cpf + "\n";
	}
	
	
}