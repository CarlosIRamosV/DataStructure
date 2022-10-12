package me.CarlosIRamosV.TDAVector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Ui {
    private final TDAVector tdaVector;
    public JPanel contentPane;
    private JPanel panelValorFinal;
    private JLabel labelValorFinal;
    private JTextField inputValorFinal;
    private JButton inputButtonValorFinal;
    private JPanel panelValorPorOrden;
    private JLabel labelValorPorOrden;
    private JTextField inputValorPorOrden;
    private JButton inputButtonValorPorOrden;
    private JLabel ActionStatus;
    private JLabel vectorView;
    private JButton eliminarValorFinalButton;

    public Ui() {
        tdaVector = new TDAVector();
        // Placeholder
        String textPlaceholder = "Ingrese un numero entero";

        enablePlaceholder(inputValorFinal, textPlaceholder);
        enablePlaceholder(inputValorPorOrden, textPlaceholder);

        inputValorFinal.addFocusListener(placeholder(inputValorFinal, textPlaceholder));
        inputValorPorOrden.addFocusListener(placeholder(inputValorPorOrden, textPlaceholder));

        // Input valor al final
        inputValorFinal.addActionListener(inputValorFinalActionListener());
        inputButtonValorFinal.addActionListener(inputValorFinalActionListener());

        // Input valor por orden
        inputValorPorOrden.addActionListener(inputValorByOrderActionListener());
        inputButtonValorPorOrden.addActionListener(inputValorByOrderActionListener());
        eliminarValorFinalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tdaVector.deleteAtTheEnd()) {
                    ActionStatus.setText("Se elimino el valor final");
                } else {
                    ActionStatus.setText("No se pudo eliminar el valor final");
                }
                vectorView.setText(tdaVector.getVector());
            }
        });
    }

    private FocusAdapter placeholder(JTextField jTextField, String placeholder) {
        return new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (jTextField.getText().equals(placeholder)) {
                    disablePlaceholder(jTextField);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (jTextField.getText().isEmpty()) {
                    enablePlaceholder(jTextField, placeholder);
                }
            }
        };
    }

    private void enablePlaceholder(JTextField jTextField, String placeholder) {
        jTextField.setForeground(Color.GRAY);
        jTextField.setText(placeholder);
    }

    private void disablePlaceholder(JTextField jTextField) {
        jTextField.setForeground(Color.BLACK);
        jTextField.setText("");
    }

    private ActionListener inputValorFinalActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (tdaVector.addAtTheEnd(Integer.parseInt(inputValorFinal.getText()))) {
                        ActionStatus.setText("Se agrego el valor: " + inputValorFinal.getText());
                        inputValorFinal.setText("");
                        vectorView.setText(tdaVector.getVector());
                    } else {
                        ActionStatus.setText("Error: El vector esta lleno");
                    }
                } catch (NumberFormatException exception) {
                    ActionStatus.setText("Error: El valor ingresado no es un numero entero");
                }
            }
        };
    }

    private ActionListener inputValorByOrderActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (tdaVector.addByOrder(Integer.parseInt(inputValorPorOrden.getText()))) {
                        ActionStatus.setText("Se agrego el valor: " + inputValorPorOrden.getText());
                        inputValorPorOrden.setText("");
                        vectorView.setText(tdaVector.getVector());
                    } else {
                        ActionStatus.setText("Error: El vector esta lleno");
                    }
                } catch (NumberFormatException exception) {
                    ActionStatus.setText("Error: El valor ingresado no es un numero entero");
                }
            }
        };
    }
}
