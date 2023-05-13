package IntroduçãoHerança;

public class Ex1ProfessorDoutor extends Ex1Professor {
	private String anoObtencaoTitutlo;
	private String instituicaoDoutorado;
	
	
	public Ex1ProfessorDoutor() {
		
	}

	
	public String getAnoObtencaoTitutlo() {
		return anoObtencaoTitutlo;
	}

	public void setAnoObtencaoTitutlo(String anoObtencaoTitutlo) {
		this.anoObtencaoTitutlo = anoObtencaoTitutlo;
	}

	public String getInstituicaoDoutorado() {
		return instituicaoDoutorado;
	}

	public void setInstituicaoDoutorado(String instituicaoDoutorado) {
		this.instituicaoDoutorado = instituicaoDoutorado;
	}
	
	
}
