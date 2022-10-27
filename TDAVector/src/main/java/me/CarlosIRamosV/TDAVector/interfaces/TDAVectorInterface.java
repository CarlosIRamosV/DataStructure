package me.CarlosIRamosV.TDAVector.interfaces;

/**
 * Interfaz que define los métodos que debe implementar el TDA Vector
 *
 * @author Carlos Ramos
 * @version 1.0
 */
public interface TDAVectorInterface {
    boolean agregarElementoFinal(int elemento);

    boolean eliminarElementoFinal();

    boolean insertarElemento(int elemento);

    boolean eliminarElemento(int elemento);

    String getVector();

    void burbuja();

    void burbujaInvertido();

    void shell();

    void shellInvertido();

    String buscarElemento(int elemento);
}
