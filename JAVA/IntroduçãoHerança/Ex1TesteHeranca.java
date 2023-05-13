package IntroduçãoHerança;

public class Ex1TesteHeranca {
    public static void main(String[] args) {
        Ex1Pessoa p1 = new Ex1Pessoa();
        p1.setNome("Maria dos Santos");
        p1.setCpf("099.424.632-34");
        p1.setSexo('F');

        System.out.println("Pessoa: \n" + p1.dadosPessoa());

        Ex1Aluno a1 = new Ex1Aluno();
        a1.setNome("Paulo Plinio");
        a1.setCpf("125.467.236-35");
        a1.setSexo('M');
        a1.setCurso("ADS");
        a1.setAnoIngresso(2022);

        System.out.println("Aluno: \n" + a1.dadosAluno());


    }
}
