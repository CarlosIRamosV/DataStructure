package me.CarlosIRamosV.TDAListas;

import me.CarlosIRamosV.TDAListas.interfaces.NodoInterface;

public class Nodo implements NodoInterface {
    private int info;
    private Nodo siguiente;

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

    @Override
    public int getInfo() {
        return info;
    }

    @Override
    public void setInfo(int info) {
        this.info = info;
    }

    @Override
    public Nodo getSiguiente() {
        return siguiente;
    }

    @Override
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
