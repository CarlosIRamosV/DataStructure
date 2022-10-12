package me.CarlosIRamosV.TDAVector;

public class TDAVector {
    int[] vector;
    int numElem;

    TDAVector() {
        vector = new int[16];
        numElem = 0;
    }

    public boolean addAtTheEnd(int value) {
        if (numElem < vector.length) {
            vector[numElem] = value;
            numElem++;
            return true;
        }
        return false;
    }

    public boolean deleteAtTheEnd() {
        if (numElem > 0) {
            numElem--;
            return true;
        }
        return false;
    }

    public boolean addByOrder(int dato) {
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

    public String getVector() {
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
                    vector[i + 1] = vector[i];
                    if (vector[i - 1] <= dato) {
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
