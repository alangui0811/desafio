package com.alan.desafio.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosPersona(String gender, String first, String last, Integer age, String country, String city) {

}
