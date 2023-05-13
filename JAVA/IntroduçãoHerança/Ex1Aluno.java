package IntroduçãoHerança;

public class Ex1Aluno extends Ex1Pessoa{
	private String curso;
	private int anoIngresso;
	
	

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getAnoIngresso() {
		return anoIngresso;
	}
	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	
	public String dadosAluno() {
		String str = dadosPessoa() + "Curso: " + curso + "\nAno de Ingresso: " + anoIngresso;
		return str;  
	}
}

