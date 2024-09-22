package com.mitocode.inter.impl;

public class FabricaNinos implements  FabricaAbstrac {
    private String estilo;
    private String color;
    private String talla;
    private String tacon;


    public FabricaNinos() {
        this.estilo = "macasinas";
        this.color = "negras";
        this.talla = "22";
        this.tacon = "0.05 cm";
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
