package com.cga.herenciaAnimal;

public class Rana extends Anfibio implements Animal {

    // Atributos
    String especie;
    boolean venenosa;

    // Constructor
    public Rana(double tamanio, String color, double peso, String especie, boolean venenosa) {
        super(tamanio, color, peso);
        this.especie = especie;
        this.venenosa = venenosa;
    }

    // Getter and Setter
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

    public String cazar() {
        return "Está cazando";
    }
    public String perseguir() {
        return "Está persiguiendo";
    }
    public String observar() {
        return "Está observando";
    }
    public String huir(){
        return "Está huyendo";
    }
}
