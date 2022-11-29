package me.CarlosIRamosV.TDAAlumnos.interfaces;

import me.CarlosIRamosV.TDAAlumnos.Nodo;

/**
 * Interfaz que define los métodos que debe implementar el TDAListas
 *
 * @author Carlos Ramos
 * @version 1.0
 */
public interface TDAAlumnosInterface {
    /**
     * Agrega un nodo a la lista
     *
     * @param nodo Nodo a agregar
     */
    void agregar(Nodo nodo);

    /**
     * Agrega un nodo a la lista
     *
     * @param noCtrl  Número de control del alumno
     * @param nombre  Nombre del alumno
     * @param carrera Carrera del alumno
     */
    void agregar(String noCtrl, String nombre, String carrera);

    /**
     * Elimina el nodo que contiene el número de control especificado
     *
     * @param noCtrl Número de control del alumno
     */
    boolean eliminar(String noCtrl);

    /**
     * Busca el nodo que contiene el número de control especificado
     *
     * @param noCtrl Número de control del alumno
     * @return Nodo que contiene el número de control especificado
     * @throws NullPointerException Si no se encuentra el nodo
     */
    Nodo buscar(String noCtrl);

    /**
     * Regresa el nodo Inicio
     *
     * @return Nodo Inicio
     */
    Nodo getInicio();

}

