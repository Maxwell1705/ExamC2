package com.example.exac2;

public class BombaGasolina {
    private int numBomba;
    private int capacidadBomba;
    private int tipoGasolina;
    private float PrecioGasolina;
    private int acumulador;

    public BombaGasolina(int numBomba, int capacidadBomba, int tipoGasolina, float precioGasolina, int acumulador) {
        this.numBomba = numBomba;
        this.capacidadBomba = capacidadBomba;
        this.tipoGasolina = tipoGasolina;
        PrecioGasolina = precioGasolina;
        this.acumulador = acumulador;
    }
    public BombaGasolina(){

    }

    public int getNumBomba() {
        return numBomba;
    }

    public void setNumBomba(int numBomba) {
        this.numBomba = numBomba;
    }

    public int getCapacidadBomba() {
        return capacidadBomba;
    }

    public void setCapacidadBomba(int capacidadBomba) {
        this.capacidadBomba = capacidadBomba;
    }

    public int getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(int tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public float getPrecioGasolina() {
        return PrecioGasolina;
    }

    public void setPrecioGasolina(float precioGasolina) {
        PrecioGasolina = precioGasolina;
    }

    public int getAcumulador() {
        return acumulador;
    }

    public void setAcumulador(int acumulador) {
        this.acumulador = acumulador;
    }

    public float hacerventa(int cantidad){
        this.acumulador=acumulador+cantidad;
        return cantidad*this.PrecioGasolina;
    }
}

