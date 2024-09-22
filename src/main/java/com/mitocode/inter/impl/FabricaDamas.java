package com.mitocode.inter.impl;

public class FabricaDamas  implements FabricaAbstrac{
    private String estilo;
    private String color;
    private String talla;
    private String tacon;
    private String bajos;
    private String materiales;

    public FabricaDamas() {
        this.estilo = "Sandalias";
        this.color = "blancas";
        this.talla = "35";
        this.tacon = "1 cm";
        this.materiales="suela";
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

    public String getBajos() {
        return bajos;
    }

    public void setBajos(String bajos) {
        this.bajos = bajos;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }
}
