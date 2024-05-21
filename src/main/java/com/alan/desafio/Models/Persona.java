package com.alan.desafio.Models;

public class Persona {
    private String gender;
    private String first;
    private String last;
    private Integer age;
    private String country;
    private String city;

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setFirst(String first) {
        this.first = first;
    }
    public void setLast(String last) {
        this.last = last;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }
    public String getFirst() {
        return first;
    }
    public String getLast() {
        return last;
    }
    public Integer getAge() {
        return age;
    }
    public String getCountry() {
        return country;
    }
    public String getCity() {
        return city;
    }

    public Persona(DatosPersona d){
        this.setGender(d.gender());
        this.setFirst (d.first());
        this.setLast(d.last());
        this.setAge(d.age());
        this.setCountry(d.country());
        this.setCity(d.city());
    }

    @Override
    public String toString(){
        return "Nombre: " + this.getFirst() + " " + this.getLast() + "\nGenero: " + this.getGender() + "\nEdad: " + this.getAge() + "Ubicacion: " + this.getCountry() + ", " + this.getCity();
    }

    
}
