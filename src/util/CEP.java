package util;

public class CEP {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;

    @Override
    public String toString() {
        return "CEP {Logradouro: " + logradouro + "; Bairro: " + bairro + "; Localidade: " + localidade + "}";
    }
}
