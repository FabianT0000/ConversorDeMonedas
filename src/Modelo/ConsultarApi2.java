package Modelo;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarApi2 {

public Conversion consultarDivisas() throws IOException, InterruptedException {
            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/1da9eec9a665ea440403cdf6/latest/USD");
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
//                System.out.println(response.body());
                Gson gson = new Gson();
                Conversion conversion = gson.fromJson(response.body(), Conversion.class);
                return conversion;

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

//            double valorAFN = conversion.conversion_rates().get("AFN");
//            System.out.println("Valor de AFN: " + valorAFN);

        }


    }



