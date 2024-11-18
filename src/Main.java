import util.GeradorDeJson;
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
        GeradorDeJson geraJson = new GeradorDeJson();

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Buscador de endereços pelo CEP");
        System.out.println("Digite 1 para buscar um endereço ou 2 para sair");
        while (entradaUsuario.nextInt() != 2) {
            System.out.println("Digite seu CEP abaixo:");
            requisicao.getCampoDeBusca();
            System.out.println("Inserido à lista: " + requisicao.getListaDeCEP().getLast());
            System.out.println("Digite 1 para buscar um novo endereço ou 2 para sair");
        }

        //while (requisicao.getCep() != "sair") {
        //    System.out.println("Digite seu CEP abaixo:");
        //    requisicao.getCampoDeBusca();
        // }

        geraJson.registrar(requisicao.getListaDeCEP());
        System.out.println("Lista de Endereços Capturados:");
        System.out.println(requisicao.getListaDeCEP());


    }

}
