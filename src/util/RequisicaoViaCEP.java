package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.Writer;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class RequisicaoViaCEP{

    Scanner campoDeBusca = new Scanner(System.in);
    private String cep;
    Gson gson = new GsonBuilder()
            .create();

    CEP cepObtido = new CEP();
    ArrayList<CEP> listaDeCEP = new ArrayList<>();

    public ArrayList<CEP> getListaDeCEP() {
        return listaDeCEP;
    }

    public void getCampoDeBusca() throws IOException, InterruptedException {
        setCep(campoDeBusca.next());
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        EstruturaDePesquisa novaPesquisa = new EstruturaDePesquisa();
        novaPesquisa.metodoHttp(url);

        cepObtido = gson.fromJson(novaPesquisa.getJsonCepObtido(), CEP.class);
        System.out.println(cepObtido.toString());
        listaDeCEP.add(cepObtido);
        System.out.println(listaDeCEP);

    }


    //Getters and Setters

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
