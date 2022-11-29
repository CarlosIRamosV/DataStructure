package me.CarlosIRamosV.TDAAlumnos;

import me.CarlosIRamosV.TDAAlumnos.interfaces.NodoInterface;

/**
 * Cada Nodo representa un alumno y contiene sus datos como Número de control, nombre y carrera
 *
 * @author Carlos Ramos
 * @version 1.0
 * @see NodoInterface
 */
public class Nodo implements NodoInterface {
    private Nodo siguiente;
    private Nodo anterior;
    private String noCtrl;
    private String nombre;
    private String carrera;

    /**
     * Constructor de la clase Nodo
     *
     * @param noCtrl  Número de control del alumno
     * @param nombre  Nombre del alumno
     * @param carrera Carrera del alumno
     */
    public Nodo(String noCtrl, String nombre, String carrera) {
        this.noCtrl = noCtrl;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    /**
     * Retorna el nodo siguiente
     *
     * @return Nodo siguiente
     */
    @Override
    public Nodo getSiguiente() {
        return this.siguiente;
    }

    /**
     * Establece el nodo siguiente
     *
     * @param siguiente Nodo siguiente
     */
    @Override
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Retorna el nodo anterior
     *
     * @return Nodo anterior
     */
    @Override
    public Nodo getAnterior() {
        return this.anterior;
    }

    /**
     * Establece el nodo anterior
     *
     * @param anterior Nodo anterior
     */
    @Override
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    /**
     * Establece el número de control del alumno
     *
     * @return El número de control del alumno
     */
    @Override
    public String getNoCtrl() {
        return this.noCtrl;
    }

    /**
     * Regresa el número de control del alumno
     *
     * @param noCtrl Número de control del alumno
     */
    @Override
    public void setNoCtrl(String noCtrl) {
        this.noCtrl = noCtrl;
    }

    /**
     * Retorna el nombre del alumno
     *
     * @return El nombre del alumno
     */
    @Override
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del alumno
     *
     * @param nombre Nombre del alumno
     */
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna la carrera del alumno
     *
     * @return Carrera del alumno
     */
    @Override
    public String getCarrera() {
        return this.carrera;
    }

    /**
     * Establece la carrera del alumno
     *
     * @param carrera Carrera del alumno
     */
    @Override
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
