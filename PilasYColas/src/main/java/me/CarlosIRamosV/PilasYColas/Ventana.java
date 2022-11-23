package me.CarlosIRamosV.PilasYColas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Carlos Ramos
 * @version 1.0
 */
public class Ventana {
    PilasYColas pilaCola;
    public JPanel contentPanel;
    private JLabel outPila;
    private JLabel outColas;
    private JButton btnPilaAgregar;
    private JButton btnColaAgregar;
    private JButton btnColaEliminar;
    private JButton btnPilaEliminar;
    private JTextField inPila;
    private JTextField inCola;

    public Ventana() {
        pilaCola = new PilasYColas();
        btnPilaAgregar.addActionListener(AgregarPila());
        inPila.addActionListener(AgregarPila());

        btnColaAgregar.addActionListener(AgregarCola());
        inCola.addActionListener(AgregarCola());
        btnPilaEliminar.addActionListener(e -> {
            pilaCola.eliminarPila();
            outPila.setText(pilaCola.getPila());
        });
        btnColaEliminar.addActionListener(e -> {
            pilaCola.eliminarCola();
            outColas.setText(pilaCola.getCola());
        });
    }

    public ActionListener AgregarPila() {
        return e -> {
            if (pilaCola.agregarPila(Integer.parseInt(inPila.getText()))) {
                inPila.setText("");
                outPila.setText(pilaCola.getPila());
            } else {
                JOptionPane.showMessageDialog(null, "La pila está llena");
            }
        };
    }

    public ActionListener AgregarCola() {
        return e -> {
            if (pilaCola.agregarCola(Integer.parseInt(inCola.getText()))) {
                inCola.setText("");
                outColas.setText(pilaCola.getCola());
            } else {
                JOptionPane.showMessageDialog(null, "La cola está llena");
            }
        };
    }
}
