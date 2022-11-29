package me.CarlosIRamosV.TDAAlumnos;

import me.CarlosIRamosV.TDAAlumnos.interfaces.TDAAlumnosInterface;

import java.util.Objects;

/**
 * Clase que implementa una lista enlazada con nodos que contienen un número de control, nombre y carrera que representa a un alumno.
 *
 * @author Carlos Ramos
 * @version 1.0
 * @see TDAAlumnosInterface
 */
@SuppressWarnings({"unused", "DuplicatedCode"})
public class TDAAlumnos implements TDAAlumnosInterface {
    private Nodo inicio;

    /**
     * Agrega un nodo a la lista
     *
     * @param nodo Nodo a agregar
     */
    @Override
    public void agregar(Nodo nodo) {
        if (inicio == null) {
            inicio = nodo;
        } else {
            if (nodo.getNoCtrl().compareTo(inicio.getNoCtrl()) < 0) {
                nodo.setSiguiente(inicio);
                inicio.setAnterior(nodo);
                inicio = nodo;
            } else {
                Nodo aux = inicio;
                while (aux.getSiguiente() != null && nodo.getNoCtrl().compareTo(aux.getSiguiente().getNoCtrl()) > 0) {
                    aux = aux.getSiguiente();
                }
                if (nodo.getNoCtrl().compareTo(aux.getNoCtrl()) > 0) {
                    nodo.setAnterior(aux);
                    aux.setSiguiente(nodo);
                } else {
                    nodo.setAnterior(aux.getAnterior());
                    nodo.setSiguiente(aux);
                    aux.getAnterior().setSiguiente(nodo);
                    aux.setAnterior(nodo);
                }
            }
        }
    }

    /**
     * Agrega un nodo la lista
     *
     * @param noCtrl  Número de control del alumno
     * @param nombre  Nombre del alumno
     * @param carrera Carrera del alumno
     */
    @Override
    public void agregar(String noCtrl, String nombre, String carrera) {
        agregar(new Nodo(noCtrl, nombre, carrera));
    }

    /**
     * Elimina el nodo que contiene el número de control especificado
     *
     * @param noCtrl Número de control del alumno
     */
    @Override
    public boolean eliminar(String noCtrl) {
        try {
            Nodo aux = buscar(noCtrl);
            if (aux.getAnterior() == null && aux.getSiguiente() == null) {
                inicio = null;
            } else {
                if (aux.getSiguiente() == null) {
                    aux.getAnterior().setSiguiente(null);
                    aux.setAnterior(null);
                } else {
                    aux.getAnterior().setSiguiente(aux.getSiguiente());
                    aux.getSiguiente().setAnterior(aux.getAnterior());
                    aux.setAnterior(null);
                    aux.setSiguiente(null);
                }
            }
            System.gc();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Busca el nodo que contiene el número de control especificado
     *
     * @param noCtrl Número de control del alumno
     * @return Nodo que contiene el número de control especificado
     * @throws NullPointerException Si no se encuentra el nodo
     */
    @Override
    public Nodo buscar(String noCtrl) throws NullPointerException {
        Nodo aux = inicio;
        while (aux != null && !Objects.equals(noCtrl, aux.getNoCtrl())) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            return aux;
        } else {
            throw new NullPointerException("No se encontró el nodo");
        }
    }

    /**
     * Regresa el nodo Inicio
     *
     * @return Nodo Inicio
     */
    public Nodo getInicio() {
        return inicio;
    }
}