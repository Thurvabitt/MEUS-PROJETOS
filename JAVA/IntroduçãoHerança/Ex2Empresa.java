package IntroduçãoHerança;
import java.util.ArrayList;

public class Ex2Empresa {
	private String Nome;
	private String cnpj;
	private ArrayList<Ex2Empregado> empregado;
	
	public Ex2Empresa() {
		empregado = new ArrayList<Ex2Empregado>();
	}
	
	public Ex2Empresa(String nome, String cnpj, ArrayList<Ex2Empregado> empregado) {
		this.Nome = nome;
		this.cnpj = cnpj;
		this.empregado = empregado;
		
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public ArrayList<Ex2Empregado> getEmpregado() {
		return empregado;
	}

	public void setEmpregado(ArrayList<Ex2Empregado> empregado) {
		this.empregado = empregado;
	}


	public void adicionarEmpregado(Ex2Empregado emp) {
		empregado.add(emp);
	}
	
	public int quantidadeEmpregado() {
		return empregado.size();
	}
		
	
	
	
	public int quantidadeHoristas() {
		int cont = 0;
		for(int i = 0; i<empregado.size(); i++) {
			if(empregado.get(i) instanceof Ex2Horista) {
				cont++;
			}
		}
		return cont;
	}
	
	
	public int quantidadeAssalariado() {
		int cont = 0;
		for(int i = 0; i < empregado.size(); i++) {
			if(empregado.get(i) instanceof Ex2Assalariado) {
				cont++;
			}
		}
		return cont++;
	}
	
	
	public double custoMensal() {
		double custo = 0;
		for(int i=0; i<empregado.size(); i++) {
			if(empregado.get(i) instanceof Ex2Assalariado) {
				Ex2Assalariado a1 = (Ex2Assalariado)empregado.get(i);
				custo += a1.getSalario();
			}else {
				Ex2Horista h1 = (Ex2Horista) empregado.get(i);
				custo += h1.getValor()*h1.getHoras();
			}
		}
		return custo;
	}
	
	
	
	
	
	
	
}
