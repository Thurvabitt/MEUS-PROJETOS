package ExerciciosComExtendsEarraylists;

import java.util.ArrayList;

public class Ex1TesteFuncionario {
	public static void main(String[] args) {
		Ex1Gerente f1 = new Ex1Gerente("José Silva", "948.356.867-27", 3500);
		
		Ex1Presidente f2 = new Ex1Presidente("Sebastião", "54784.374.256-21", 1800);
		
		Ex1Diretor f3 = new Ex1Diretor ("Mario Santana", "245.467.246-96", 7500);
		
		ArrayList<Ex1Funcionario> funcionarios = new ArrayList<Ex1Funcionario>();
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		for(int i = 0; i < funcionarios.size(); i++) {
			System.out.println(funcionarios.get(i).toString());
			System.out.println("Bonificação: " + funcionarios.get(i).bonificacao() + "\n");
		}
	}
}
