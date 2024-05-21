package com.alan.desafio.services;

import java.io.IOError;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.management.RuntimeErrorException;

public class ConsumoApi {
    public String obtenerDatos(String uri){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(uri))
            .build();
        HttpResponse<String> response=null;

        try {
            response = client 
                .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {   
            throw new RuntimeException(e);
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        String json = response.body();
        return json;
    }
}
