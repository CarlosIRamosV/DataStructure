package me.CarlosIRamosV.TDAListas;

import me.CarlosIRamosV.TDAListas.interfaces.NodoInterface;

public class Nodo implements NodoInterface {
    private int info;
    private Nodo siguiente;
    private int inicio ;
    private int aux;

    public Nodo() {
        setInfo(0);
        setSiguiente(null);
    }

    public Nodo(int info) {
        setInfo(info);
        setSiguiente(null);
    }

    public Nodo(int info, Nodo siguiente) {
        setInfo(info);
        setSiguiente(siguiente);
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getAux() {
        return aux;
    }

    public int getInfo() {
        return info;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public int getInicio() {
        return inicio;
    }
}
