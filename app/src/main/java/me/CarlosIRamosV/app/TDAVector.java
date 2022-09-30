package me.CarlosIRamosV.app;

public class TDAVector {
    int[] vector;
    int numElem;

    TDAVector() {
        vector = new int[16];
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
        for (int i = 0; i < numElem; i++) {
            stringBuilder.append(vector[i]);
            if (i != (numElem-1)) {
                stringBuilder.append(" ");
            }
        }
        return String.valueOf(stringBuilder);
    }

    public String getNumElem() {
        return String.valueOf(numElem);
    }

    public String getLastElement() {
        if (numElem > 0) {
            return String.valueOf(vector[numElem-1]);
        }
        return "";
    }
    public boolean eliminarElementoFinal() {
        if (numElem > 0) {
            vector[numElem-1] = 0;
            numElem--;
            return true;
        }
        return false;
    }

}
