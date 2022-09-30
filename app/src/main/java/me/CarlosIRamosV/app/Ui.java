package me.CarlosIRamosV.app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ui {
    private TDAVector tdaVector; // <--- This is the only change
    public JPanel contentPane;
    private JButton inputButtonValorFinal;
    private JTextField inputValorFinal;
    private JLabel alertasValorFinal;
    private JButton eliminarElementoFinalButton;
    private JPanel debugPanel;
    private JLabel debugViewNumElem;
    private JLabel debugViewVector;
    private JLabel action;


    public Ui() {
        tdaVector = new TDAVector(); // <--- This is the only change
        inputButtonValorFinal.addActionListener(addElemento());
        inputValorFinal.addActionListener(addElemento());
        eliminarElementoFinalButton.addActionListener(deleteElemento());
    }

    private ActionListener addElemento() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tdaVector.agregarElementoFinal(Integer.parseInt(inputValorFinal.getText()))) {
                    inputValorFinal.setText("");
                    debugViewVector.setText(tdaVector.getVector());
                    debugViewNumElem.setText(tdaVector.getNumElem());
                    //alertasValorFinal.setText("Elemento agregado correctamente");
                    action.setText("Se agrego el valor: " + tdaVector.getLastElement());
                } else {
                    action.setText("Error: El vector esta llano");
                }
            }
        };
    }

    private ActionListener deleteElemento() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lastElement = tdaVector.getLastElement();
                if (tdaVector.eliminarElementoFinal()) {
                    debugViewVector.setText(tdaVector.getVector());
                    debugViewNumElem.setText(tdaVector.getNumElem());
                    //alertasValorFinal.setText("Elemento eliminado correctamente");
                    action.setText("Se elimino el valor: " + lastElement);
                } else {
                    action.setText("Error: El vector esta vacio");
                }

            }
        };
    }
}
