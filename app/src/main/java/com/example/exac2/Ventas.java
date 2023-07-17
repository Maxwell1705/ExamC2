package com.example.exac2;

public class Ventas {
    private int numBomba;
    private int tipoGasolina;
    private float precioGasolina;
    private float cantidadGasolina;
    private float totalpa;

    public Ventas(int numBomba, int tipoGasolina, float precioGasolina, float cantidadGasolina, float totalpa) {
        this.numBomba = numBomba;
        this.tipoGasolina = tipoGasolina;
        this.precioGasolina = precioGasolina;
        this.cantidadGasolina = cantidadGasolina;
        this.totalpa = totalpa;
    }
    public Ventas(){

    }

    public int getNumBomba() {
        return numBomba;
    }

    public void setNumBomba(int numBomba) {
        this.numBomba = numBomba;
    }

    public int getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(int tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public float getPrecioGasolina() {
        return precioGasolina;
    }

    public void setPrecioGasolina(float precioGasolina) {
        this.precioGasolina = precioGasolina;
    }

    public float getCantidadGasolina() {
        return cantidadGasolina;
    }

    public void setCantidadGasolina(float cantidadGasolina) {
        this.cantidadGasolina = cantidadGasolina;
    }

    public float getTotalpa() {
        return totalpa;
    }

    public void setTotalpa(float totalpa) {
        this.totalpa = totalpa;
    }
}

