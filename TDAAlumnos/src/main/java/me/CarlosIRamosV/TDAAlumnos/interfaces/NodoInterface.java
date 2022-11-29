package me.CarlosIRamosV.TDAAlumnos.interfaces;

import me.CarlosIRamosV.TDAAlumnos.Nodo;

public interface NodoInterface {
    /**
     * Retorna el nodo siguiente
     *
     * @return Nodo siguiente
     */
    Nodo getSiguiente();

    /**
     * Establece el nodo siguiente
     *
     * @param siguiente Nodo siguiente
     */
    void setSiguiente(Nodo siguiente);

    /**
     * Retorna el nodo anterior
     *
     * @return Nodo anterior
     */
    Nodo getAnterior();

    /**
     * Establece el nodo anterior
     *
     * @param anterior Nodo anterior
     */
    void setAnterior(Nodo anterior);

    /**
     * Establece el número de control del alumno
     *
     * @return El número de control del alumno
     */
    String getNoCtrl();

    /**
     * Regresa el número de control del alumno
     *
     * @param noCtrl Número de control del alumno
     */
    void setNoCtrl(String noCtrl);

    /**
     * Retorna el nombre del alumno
     *
     * @return El nombre del alumno
     */
    String getNombre();

    /**
     * Establece el nombre del alumno
     *
     * @param nombre Nombre del alumno
     */
    void setNombre(String nombre);

    /**
     * Retorna la carrera del alumno
     *
     * @return La carrera del alumno
     */
    String getCarrera();

    /**
     * Establece la carrera del alumno
     *
     * @param carrera Carrera del alumno
     */
    void setCarrera(String carrera);
}
