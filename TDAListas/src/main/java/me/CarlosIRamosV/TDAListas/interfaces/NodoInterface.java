package me.CarlosIRamosV.TDAListas.interfaces;

import me.CarlosIRamosV.TDAListas.Nodo;

public interface NodoInterface {
    void setInfo(int info);
    int getInfo();
    void setSiguiente(Nodo siguiente);
    Nodo getSiguiente();
}
