package agenda2;

public class Endereco {
    private String enderecoComercial;
    private String enderecoResidencial;

    public Endereco(String enderecoComercial, String enderecoResidencial) {
        this.enderecoComercial = enderecoComercial;
        this.enderecoResidencial = enderecoResidencial;
    }

    public String getEnderecoComercial() {
        return enderecoComercial;
    }

    public String getEnderecoResidencial() {
        return enderecoResidencial;
    }
}
