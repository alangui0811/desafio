package com.alan.desafio.services;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
