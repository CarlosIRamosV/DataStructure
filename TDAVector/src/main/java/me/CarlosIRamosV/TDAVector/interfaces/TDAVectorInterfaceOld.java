package me.CarlosIRamosV.TDAVector.interfaces;

/**
 * Interfaz que define los métodos que debe implementar el TDA Vector
 *
 * @author Carlos Ramos
 * @version 1.0
 * @deprecated Esta interfaz no se debe usar, se recomienda usar la interfaz {@link TDAVectorInterface}
 */
@Deprecated
public interface TDAVectorInterfaceOld {
    boolean agregarElementoFinal(int dato);

    boolean eliminarElementoFinal();

    boolean insertarElemento(int dato);

    boolean eliminarElemento(int dato);

    String getElementos();

    String getElementosOrdenados();

    String getElementosInvertidos();

    boolean insertarElementoDes(int dato);

    boolean eliminarElementoDes(int dato);

}
