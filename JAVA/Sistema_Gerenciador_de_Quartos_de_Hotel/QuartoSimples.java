package Sistema_Gerenciador_de_Quartos_de_Hotel;

	public class QuartoSimples extends Quarto {
		private int camas;

    public QuartoSimples(int numQuarto, double diaria, int camas) {
        super(numQuarto, diaria);
        this.camas = camas;
    }

    public void info() {
        System.out.println("Quarto Simples - Número: " + numQuarto);
        System.out.println("Valor da Diária: R$" + diaria);
        System.out.println("Quantidade de Camas: " + camas);
    
    }    
}
