package util;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class GeradorDeJson {
    FileWriter gerarJson = new FileWriter("CEP.json");
    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    public GeradorDeJson() throws IOException {
    }

    public void registrar(ArrayList<CEP> listaDeCeps) throws IOException {
    gerarJson.write(gson.toJson(listaDeCeps));
    gerarJson.close();
    }
}
