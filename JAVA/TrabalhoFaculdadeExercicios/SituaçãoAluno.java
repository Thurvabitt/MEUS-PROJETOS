package TrabalhoFaculdadeExercicios;

public class SituaçãoAluno {
	 private int matricula;
	    private String nome;
	    private double nota1;
	    private double nota2;
	    private double notaTrabalho;
	    
	    
	    // construtor sem parâmetros
	    public SituaçãoAluno(){
	    	
	    }
	    
	    
	    // construtor com parâmetros
	    public SituaçãoAluno(int matricula, String nome, double nota1, double nota2, double notaTrabalho){
	        this.matricula = matricula;
	        this.nome = nome;
	        this.nota1 = nota1;
	        this.nota2 = nota2;
	        this.notaTrabalho = notaTrabalho;
	    }


	    
	    //GETS E SETS
		public int getMatricula() {
			return matricula;
		}


		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public double getNota1() {
			return nota1;
		}


		public void setNota1(double nota1) {
			this.nota1 = nota1;
		}


		public double getNota2() {
			return nota2;
		}


		public void setNota2(double nota2) {
			this.nota2 = nota2;
		}


		public double getNotaTrabalho() {
			return notaTrabalho;
		}


		public void setNotaTrabalho(double notaTrabalho) {
			this.notaTrabalho = notaTrabalho;
		}


		
		//método TOSTRING
		public String toString() {
			return "Aluno [matricula=" + matricula + ", nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2
					+ ", notaTrabalho=" + notaTrabalho + "]";
		}
	    

		
		 public double calculaMediaPonderada() {
			double mediaNotas = (nota1 * 2.5 + nota2 * 2.5) / 5.0; 
			double mediaFinal = (mediaNotas * 0.6) + (notaTrabalho * 0.4);
			return mediaFinal;
		 }
	    
		 
		 public int verificaSituacaoAluno() {
			 double mediaAluno = calculaMediaPonderada();
			 if(mediaAluno >= 6.0) {
				 return 1; //Aluno aprovado :D
				 
			 }else if(mediaAluno >=4.0 && mediaAluno == 5.9) {
				 return 2; //Aluno ficou de recuperação :/
			 
			 }else {
				 return 3; //Aluno reprovado :(
			 }
			 
			 
			 
		 }
		 
		 
		 
		 
}