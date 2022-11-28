package me.CarlosIRamosV.TDAListas2;

import me.CarlosIRamosV.TDAListas2.interfaces.NodoInterface;

public class Nodo implements NodoInterface {
    private int info;
    private Nodo siguiente;
    private Nodo anterior;

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

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
