package ExerciciosComExtendsEarraylists;

public class Ex2PessoaJuridica extends Ex2PessoaAbstrata {
	private String cnpj;
	
	public Ex2PessoaJuridica() {
		
	}
	
	public Ex2PessoaJuridica(String nome, String endereco, String telefone, String cnpj) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String toString() {
		return super.toString() + "Cnpj:" + cnpj + "\n";
	}
	
	
}
