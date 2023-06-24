package Sistema_Gerenciador_de_Quartos_de_Hotel;

	public class QuartoLuxo extends Quarto {
		private int camas;
		private boolean hidromassagem;

	public QuartoLuxo(int numQuarto, double diaria, int camas, boolean hidromassagem) {
		super(numQuarto, diaria);
		this.camas = camas;
		this.hidromassagem = hidromassagem;
	}

	public void info() {
		System.out.println("Número do quarto de luxo: " + numQuarto);
		System.out.println("Valor da Diária: R$" + diaria);
		System.out.println("Possui Hidromassagem: " + (hidromassagem ? "Sim" : "Não"));
	}
}
