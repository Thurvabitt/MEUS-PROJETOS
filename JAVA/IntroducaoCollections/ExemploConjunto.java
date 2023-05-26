package IntroducaoCollections;

import java.util.HashSet;
import java.util.Iterator;

public class ExemploConjunto {
	public static void main(String[] args) {
		HashSet<String> cargos = new HashSet<String>();
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretária");
		cargos.add("Analista de TI");
		
		for(String cargo: cargos) {
			System.out.println("Cargo: " + cargo);
		}
		
		//utilizando o iterator ( maneira de percorrer e acessar os elementos do ArrayList)
		Iterator<String> elemento = cargos.iterator();
		
		while(elemento.hasNext()) {
			System.out.println("Elemento atual: " + elemento.next());
		}
	}
}
