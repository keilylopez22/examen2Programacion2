package com.mitocode.inter.impl;

public class Calzado {
    private String estilo;
    private String color;
    private String talla;
    private String tacon;
    private String materiales;

    // Constructor
    public Calzado(String estilo, String color, String talla, String tacon, String materiales) {
        this.estilo = estilo;
        this.color = color;
        this.talla = talla;
        this.tacon = tacon;
        this.materiales = materiales;
    }

    @Override
    public String toString() {
        return "Calzado [Estilo: " + estilo + ", Color: " + color + ", Talla: " + talla + ", Tacón: " + tacon + ", Materiales: " + materiales + "]";
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTacon() {
        return tacon;
    }

    public void setTacon(String tacon) {
        this.tacon = tacon;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

}

