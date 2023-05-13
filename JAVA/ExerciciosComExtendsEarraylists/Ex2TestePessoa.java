package ExerciciosComExtendsEarraylists;

import java.util.ArrayList;

public class Ex2TestePessoa {
	public static void main(String[] args) {
		Ex2PessoaFisica p1 = new Ex2PessoaFisica("Arthur Bitencourt Silva", "Rua X n° 200", "5769-8504", "000.000.000-00");
		
		
		Ex2PessoaJuridica p2 = new Ex2PessoaJuridica("Empresa T3", "Rua Y n° 1", "3456-3704", "999.999.999-99");
		
		
		
		ArrayList<Ex2PessoaAbstrata> pessoas = new ArrayList<Ex2PessoaAbstrata>();
		
		
		pessoas.add(p1);
		pessoas.add(p2);
		
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.println("Pessoa ["+i+"]:");
			System.out.println(pessoas.get(i).toString());
		}
	}
}
