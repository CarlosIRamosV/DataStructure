package me.CarlosIRamosV.TDAListas2.interfaces;

import me.CarlosIRamosV.TDAListas2.Nodo;

/**
 * Interfaz que define los métodos que debe implementar el TDAListas
 *
 * @author Carlos Ramos
 * @version 1.0
 */
public interface TDAListasInterface {
    void setInicio(Nodo inicio);
    Nodo getInicio();
    void agregarInicio(int info);
    void agregarFinal(int info);
    void eliminarFinal();
    void eliminarInicio();
    String getLista();
    int contarNodos();
    void buscar(int info);
}

