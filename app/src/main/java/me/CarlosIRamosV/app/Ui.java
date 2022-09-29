package me.CarlosIRamosV.app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ui {
    private TDAVector tdaVector  = new TDAVector();
    public JPanel contentPane;
    private JButton inputButtonValorFinal;
    private JTextField inputValorFinal;
    private JLabel alertasValorFinal;


    public Ui() {
        inputButtonValorFinal.addActionListener(addElemento());
        inputValorFinal.addActionListener(addElemento());
    }

    private ActionListener addElemento() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tdaVector.agregarElementoFinal(Integer.parseInt(inputValorFinal.getText()))) {
                    inputValorFinal.setText("");
                } else {
                    alertasValorFinal.setText("Error: El vector esta llano");
                }
                System.out.println(tdaVector.getVector());
            }
        };
    }
}
