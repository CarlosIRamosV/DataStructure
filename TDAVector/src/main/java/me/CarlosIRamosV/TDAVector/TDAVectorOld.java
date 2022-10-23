package me.CarlosIRamosV.TDAVector;

import me.CarlosIRamosV.TDAVector.interfaces.TDAVectorInterfaceOld;

import java.util.Arrays;

/**
 * Clase que implementa el TDA Vector
 *
 * @author Carlos Ramos
 * @version 1.0
 * @see TDAVectorInterfaceOld
 * @deprecated Esta clase no se debe usar, se recomienda usar la clase {@link TDAVector}
 */
@Deprecated
public class TDAVectorOld implements TDAVectorInterfaceOld {
    int[] vector;
    int numElem;

    TDAVectorOld() {
        vector = new int[16];
        numElem = 0;
    }

    /**
     * Agrega un elemento al final del vector
     *
     * @param elemento Elemento a agregar
     * @return true si se agrego el elemento, false si no se pudo agregar
     */
    @Override
    public boolean agregarElementoFinal(int elemento) {
        if (numElem < vector.length) {
            vector[numElem] = elemento;
            numElem++;
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarElementoFinal() {
        if (numElem > 0) {
            numElem--;
            return true;
        }
        return false;
    }

    @Override
    public boolean insertarElemento(int dato) {
        if (numElem < vector.length) {
            int position = 0;
            while (position < numElem && vector[position] < dato) {
                position++;
            }
            for (int i = numElem; i > position; i--) {
                vector[i] = vector[i - 1];
            }
            vector[position] = dato;
            numElem++;
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarElemento(int dato) {
        return false;
    }

    @Override
    public String getElementos() {
        StringBuilder vectorString = new StringBuilder("[");
        for (int i = 0; i < numElem; i++) {
            vectorString.append(vector[i]);
            if (i != numElem - 1) {
                vectorString.append(", ");
            }
        }
        vectorString.append("]");
        return vectorString.toString();
    }

    /**
     * Obtiene los elementos del vector ordenados de menor a mayor
     *
     * @return String con los elementos ordenados de menor a mayor
     */
    @Override
    public String getElementosOrdenados() {
        int[] vectorOrdenado = new int[numElem];
        System.arraycopy(vector, 0, vectorOrdenado, 0, numElem);
        int intervalo = numElem / 2;
        int i, j, k, aux;
        while (intervalo > 0) {
            for (i = (intervalo + 1); i <= numElem; i++) {
                j = i - intervalo;
                while (j > 0) {
                    k = j + intervalo;
                    if (vectorOrdenado[j - 1] <= vectorOrdenado[k - 1]) {
                        j = 0;
                    } else {
                        aux = vectorOrdenado[j - 1];
                        vectorOrdenado[j - 1] = vectorOrdenado[k - 1];
                        vectorOrdenado[k - 1] = aux;
                    }
                    j = j - intervalo;
                }
            }
            intervalo = intervalo / 2;
        }
        return Arrays.toString(vectorOrdenado);
    }

    /**
     * Obtiene los elementos del vector ordenados de mayor a menor
     *
     * @return String con los elementos ordenados de mayor a menor
     */
    @Override
    public String getElementosInvertidos() {
        int[] vectorOrdenado = new int[numElem];
        System.arraycopy(vector, 0, vectorOrdenado, 0, numElem);
        int intervalo = numElem / 2;
        int i, j, k, aux;
        while (intervalo > 0) {
            for (i = (intervalo + 1); i <= numElem; i++) {
                j = i - intervalo;
                while (j > 0) {
                    k = j + intervalo;
                    if (vectorOrdenado[j - 1] >= vectorOrdenado[k - 1]) {
                        j = 0;
                    } else {
                        aux = vectorOrdenado[j - 1];
                        vectorOrdenado[j - 1] = vectorOrdenado[k - 1];
                        vectorOrdenado[k - 1] = aux;
                    }
                    j = j - intervalo;
                }
            }
            intervalo = intervalo / 2;
        }
        return Arrays.toString(vectorOrdenado);
    }

    @Override
    public boolean insertarElementoDes(int dato) {
        return false;
    }

    @Override
    public boolean eliminarElementoDes(int dato) {
        return false;
    }
}

