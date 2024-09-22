package com.mitocode.inter.impl;

public class FabricaCaballeros implements FabricaAbstrac {
    private String estilo;
    private String color;
    private String talla;
    private String bajos;
    private String materiales;

    public FabricaCaballeros() {
        this.estilo = "Macasinas";
        this.color = "negros";
        this.talla = "40";
        this.bajos = "0.05 cm";
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

    public String getBajos() {
        return bajos;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public void setBajos(String bajos) {
        this.bajos = bajos;
    }


    @Override
    public void leerURL(String url) {

    }

    @Override
    public Calzado crearCalzadoFormal() {
        return null;
    }

    @Override
    public Calzado crearCalzadoDeportivo() {
        return null;
    }
}
