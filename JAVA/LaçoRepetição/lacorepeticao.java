package LaçoRepetição;

public class lacorepeticao {
 public static void main(String[] args) {
	int num = 1;
	
	System.out.println("While");
	while(num <= 10) {
		System.out.println(num);
		num += 1;
	}
	
	System.out.println("\nDo...While");
	num = 1;
	do {
		System.out.println(num);
		num++;
	}
	
	while(num <= 10);
	System.out.println("\nFor");
	for(num = 1; num <= 10; num++) {
		System.out.println(num);
	}
}
}
