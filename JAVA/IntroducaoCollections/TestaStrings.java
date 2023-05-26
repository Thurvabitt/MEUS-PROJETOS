package IntroducaoCollections;
import java.util.Collections;
import java.util.ArrayList;

public class TestaStrings {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Paulo");
		nomes.add("Carla");
		nomes.add("Ana");
		nomes.add("João");
		nomes.add("Gustavo");
		
		
		System.out.println("Antes da ordenação: " + nomes);
		
		Collections.sort(nomes); //sort = organizar
		System.out.println("Depois da ordenação: " + nomes);
	
	
		System.out.println("\nBusca binária pelo nome João:" + Collections.binarySearch(nomes, "João"));
		
		
		System.out.println("Menor elemento: " + Collections.min(nomes));
		System.out.println("Maior elemento: " + Collections.max(nomes));
	
	
	
	
	
	
	
	}
}
