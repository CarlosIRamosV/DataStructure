package me.CarlosIRamosV.TDAListas;

import me.CarlosIRamosV.TDAListas.interfaces.TDAListasInterface;

/**
 * Clase que implementa el TDA Listas
 *
 * @author Carlos Ramos
 * @version 1.0
 * @see TDAListasInterface
 */
@SuppressWarnings({"unused", "DuplicatedCode"})
public class TDAListas implements TDAListasInterface {
    private Nodo inicio;
    private Nodo aux;

    public TDAListas() {
        setInicio(null);
        setAux(null);
    }

    public TDAListas(Nodo inicio) {
        setInicio(inicio);
        setAux(null);
    }

    public TDAListas(Nodo inicio, Nodo aux) {
        setInicio(inicio);
        setAux(aux);
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public void setAux(Nodo aux) {
        this.aux = aux;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public Nodo getAux() {
        return aux;
    }

    public void siguiente() {
        setAux(getAux().getSiguiente());
    }

    public void primero() {
        setAux(getInicio());
    }

    public void insertar(int info) {
        if (getInicio() == null) {
            setInicio(new Nodo(info));
        } else {
            setInicio(new Nodo(info, getInicio()));
        }
        setAux(getInicio());
    }

    public void eliminarUltimo() {
        if (getInicio() != null) {
            if (getInicio().getSiguiente() == null) {
                setInicio(null);
            } else {
                primero();
                while (getAux().getSiguiente().getSiguiente() != null) {
                    siguiente();
                }
                getAux().setSiguiente(null);
            }
        }
    }

    public void eliminarPrimero() {
        if (getInicio() != null) {
            if (getInicio().getSiguiente() == null) {
                setInicio(null);
            } else {
                setInicio(getInicio().getSiguiente());
            }
        }
    }

    public String getLista() {
        if (inicio != null) {
            primero();
            StringBuilder lista = new StringBuilder("Lista: ");
            while (getAux() != null) {
                lista.append(getAux().getInfo());
                if (getAux().getSiguiente() != null)
                    lista.append(", ");
                siguiente();
            }
            return lista.toString();
        }
        return "Lista vaciá";
    }
}