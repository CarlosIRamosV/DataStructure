package me.CarlosIRamosV.app;

public class TDAVector {
    int[] vector;
    int numElem;

    TDAVector() {
        vector = new int[90];
        numElem = 0;
    }

    public boolean agregarElementoFinal(int dato) {
        if (numElem < vector.length) {
            vector[numElem] = dato;
            numElem++;
            return true;
        }
        return false;
    }

    public String getVector() {
        StringBuilder stringBuilder = new StringBuilder();
        if (numElem > 0) {
            for (int i = 0; i < numElem; i++) {
                stringBuilder.append(vector[i]);
                if (i != (numElem - 1)) {
                    stringBuilder.append(" ");
                }
            }
        } else {
            stringBuilder.append("El vector esta vacio");
        }
        return String.valueOf(stringBuilder);
    }

    public String getNumElem() {
        return String.valueOf(numElem);
    }

    public String getLastElement() {
        if (numElem > 0) {
            return String.valueOf(vector[numElem - 1]);
        }
        return "";
    }

    public boolean addElement(int dato) {
        if (numElem < vector.length) {
            for (int i = numElem; i >= 0; i--) {
                if (i == 0) {
                    vector[i] = dato;
                    numElem++;
                    return true;
                } else {
                    vector[i+1] = vector[i];
                    if (vector[i-1] <= dato) {
                        vector[i] = dato;
                        numElem++;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String getLasDeleteElement() {
        if (numElem >= 0) {
            return String.valueOf(vector[numElem]);
        }
        return "";
    }

    public boolean eliminarElementoFinal() {
        if (numElem > 0) {
            numElem--;
            return true;
        }
        return false;
    }

}
