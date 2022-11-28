package me.CarlosIRamosV.TDAListas2.interfaces;

import me.CarlosIRamosV.TDAListas2.Nodo;

public interface NodoInterface {
    void setInfo(int info);
    int getInfo();
    void setSiguiente(Nodo siguiente);
    Nodo getSiguiente();
    void setAnterior(Nodo anterior);
    Nodo getAnterior();
}
