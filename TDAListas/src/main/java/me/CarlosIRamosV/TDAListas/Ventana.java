package me.CarlosIRamosV.TDAListas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase que implementa la interfaz gráfica del TDA Vector
 *
 * @author Carlos Ramos
 * @version 1.0
 */
public class Ventana {
    TDAListas lista;
    public JPanel contentPanel;
    private JLabel out;
    private JTextField agregarInicioInput;
    private JButton agregarInicioButton;
    private JButton eliminarDelInicioButton;
    private JButton agregarFinalButton;
    private JLabel outSize;
    private JTextField agregarFinalInput;
    private JButton eliminarDelFinalButton;

    public Ventana() {
        lista = new TDAListas();

        agregarInicioInput.addActionListener(agregarInicio());
        agregarInicioButton.addActionListener(agregarInicio());
        agregarFinalInput.addActionListener(agregarFinal());
        agregarFinalButton.addActionListener(agregarFinal());

        eliminarDelInicioButton.addActionListener(e -> {
            lista.eliminarInicio();
            update();
        });

        eliminarDelFinalButton.addActionListener(e -> {
            lista.eliminarFinal();
            update();
        });
    }

    public ActionListener agregarInicio() {
        return e -> {
            lista.agregarInicio(Integer.parseInt(agregarInicioInput.getText()));
            agregarInicioInput.setText("");
            update();
        };
    }

    public ActionListener agregarFinal() {
        return e -> {
            lista.agregarFinal(Integer.parseInt(agregarFinalInput.getText()));
            agregarFinalInput.setText("");
            update();
        };
    }

    public void update() {
        out.setText(lista.getLista());
        outSize.setText("Tamaño: " + lista.contarNodos());
    }
}
