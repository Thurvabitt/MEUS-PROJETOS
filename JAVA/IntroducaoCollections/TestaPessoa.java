package IntroducaoCollections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaPessoa {
	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa("Maria das neves", "908.445.335008", "10/02/1895");
		Pessoa p2 = new Pessoa("João Miguel da Silva", "242.457.136-34", "24/11/2009");
		
		pessoas.add(p1);
		pessoas.add(p2);
	
		System.out.println("ANTES DA ORDENAÇÃO: \n" + pessoas);
		
		Collections.sort(pessoas);
		System.out.println("\nDEPOIS DA ORDENAÇÃO:" + pessoas);
	
	
	
	
	
	
	
	
	
	
	}
}
