package TrabalhoFaculdadeExercicios;

public class ProdutosDeLoja {
	private int Identificador;
	private String Nome;
	private double Preco;
	private int Quantidade;

	//CONSTRUTOR SEM PARÂMETRO
	public ProdutosDeLoja() {
		
	}
	//CONSTRUTOR COM PARÂMETROS
	public ProdutosDeLoja(int Identificador, String Nome, double Preco, int Quantidade) {
		this.Identificador = Identificador;
		this.Nome = Nome;
		this.Preco = Preco;
		this.Quantidade = Quantidade;
	}

	
	//METODOS DE ACESSO GET E SET
	public int getIdentificador() {
		return Identificador;
	}

	public void setIdentificador(int identificador) {
		Identificador = identificador;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	//TO STRING
	public String toString() {
		return "ProdutosDaLoja [Identificador=" + Identificador + ", Nome=" + Nome + ", Preco=" + Preco
				+ ", Quantidade=" + Quantidade + "]";
	}
	
	
	
	//MÉTODOS
	public double CalcularValorTotal() {
		return Preco * Quantidade;
	}
	
	  public void vende(int quantidadeVendida) {
	        Quantidade -= quantidadeVendida;
	    }
	
	
	  public void estoca(int quantidadeEstocada) {
	        Quantidade += quantidadeEstocada;
	    }
}