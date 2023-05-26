package IntroducaoCollections;
import java.util.ArrayList;
import java.util.Collections;
public class TestaInteiros {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(20);
		numeros.add(50);
		numeros.add(0);
		numeros.add(-10);

		System.out.println("Antes da Ordenação: " + numeros);
		
		Collections.sort(numeros); //sort = organizar
		System.out.println("\nDepois da Ordenação " + numeros);
		
		
		System.out.println("\nBusca binário pelo elemento zero: " + Collections.binarySearch(numeros, 0));
		//retornará a posição do elemento dentro do arraylist
		
		
		//se false = pelo menos um elemento igual; true = não tem elementos iguais
		System.out.println("\nConjunto disjuntos: " + Collections.disjoint(numeros, numeros));
		
		
		numeros.add(20);
		numeros.add(20);
		System.out.println("\nFrequência do elemento 20: " + Collections.frequency(numeros, 20)); //mostra quantas vezes um elemento aparece
		
		
		System.out.println("\nMenor número do ArrayList: " + Collections.min(numeros)); //menor e maior número do array
		System.out.println("Maior número do ArrayList: " + Collections.max(numeros));
		
		
		Collections.reverse(numeros); //invertendo os números do array de acordo com a posição, não em ordem numérica.
		System.out.println("\nInvertendo a lista: " + numeros); 
		
		
	}
}
