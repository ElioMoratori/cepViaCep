import util.RequisicaoViaCEP;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        RequisicaoViaCEP requisicao = new RequisicaoViaCEP();

        while (requisicao.getCep() != "sair") {
            System.out.println("Digite seu CEP abaixo:");
            requisicao.getCampoDeBusca();
        }

        requisicao.getListaDeCEP();
    }
}
