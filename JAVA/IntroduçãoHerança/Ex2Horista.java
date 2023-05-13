package IntroduçãoHerança;

public class Ex2Horista extends Ex2Empregado {
	private int horas;
	private double valor;
	
	public Ex2Horista() {
		
	}
	
	public Ex2Horista(String nome, String cpf, String setor, int horas, double valor) {
		super(nome, cpf, setor);
		this.horas = horas;
		this.valor = valor;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public String toString() {
		return super.toString() + "\n" + "Valor das horas: " + valor + "\n" + 
	"Quantidade de horas trabalhadas: " + horas + "\n";
	}
}
