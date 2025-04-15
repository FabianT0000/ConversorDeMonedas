package Modelo;


import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarApi {

    public Moneda cambioDivisa(String divisa1,String divisa2){
        URI direccion =  URI.create("https://v6.exchangerate-api.com/v6/1da9eec9a665ea440403cdf6/pair/"+divisa1+"/"+divisa2);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré la divisa,verifica de nuevo");
        }
    }

}
