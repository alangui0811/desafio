package com.alan.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.alan.desafio.Models.ConvertirDatos;
import com.alan.desafio.Models.DatosPersona;
import com.alan.desafio.services.ConsumoApi;

public class Principal {
    private Scanner tec = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private String uri = "https://randomuser.me/api/";
    List<DatosPersona> clientes = new ArrayList<>();
    private ConvertirDatos conversor = new ConvertirDatos();

    public void inicio(){
        System.out.println("¿Cuantos clientes deseas mostrar?");
        int op = 0;
        op = tec.nextInt();
    
        for (int i = 0; i < op; i++) {
            var json = consumoApi.obtenerDatos(uri);
            var datosC = conversor.obtenerDatos(json, DatosPersona.class);
            clientes.add(datosC);
        }
        clientes.forEach(System.out::println);

        

    }
}
