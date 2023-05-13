package CriandoMain;

public class Ex1MainCarro {
	public static void main(String[] args) {
		Ex1carro c1 = new Ex1carro();
		c1.tipo = "Ferrari";
		c1.cor = "Vermelha";
		c1.placa = "HNB0988";
		c1.numPortas = 2;
		
		System.out.println("Carro: " + c1.tipo + 
				           "\nCor: " + c1.cor + 
				           "\nPlaca: " + c1.placa + 
				           "\nPortas: " + c1.numPortas);
		
		System.out.println("");
		
		c1.liga();
		c1.desliga();
		c1.acelera();
		c1.freia();
		
		Ex1CarroPrivado c2 = new Ex1CarroPrivado();
		c2.setTipo("Porsche");
		c2.setCor("Prata");
		c2.setPlaca("KMM0294");
		c2.setNumPortas(4);
		
		System.out.println("\nCarro 2: ");
		System.out.println("Tipo: " + c2.getTipo() + 
						   "\nCor: " + c2.getCor() + 
						   "\nPlaca: " + c2.getPlaca() + 
						   "\nPortas: " + c2.getnumPortas());
	}
	
}