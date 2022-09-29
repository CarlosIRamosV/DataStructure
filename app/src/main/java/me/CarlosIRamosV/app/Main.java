package me.CarlosIRamosV.app;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Ui ui = new Ui();
        JFrame frame = new JFrame("<class name>");
        frame.setContentPane(ui.contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1000, 1000);
    }
}

class TDAVector {
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

    public StringBuilder getVector() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j : vector) {
            stringBuilder.append(j).append(" ");
        }
        return stringBuilder;
    }


}