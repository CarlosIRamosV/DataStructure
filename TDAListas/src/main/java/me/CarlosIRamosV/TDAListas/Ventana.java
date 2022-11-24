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
    private JTextField input;
    private JButton button1;
    private JButton eliminarUltimo;
    private JButton eliminarPrimeroButton;
    private JLabel outSize;

    public Ventana() {
        lista = new TDAListas();
        input.addActionListener(insertar());
        button1.addActionListener(insertar());
        eliminarUltimo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lista.eliminarFinal();
                update();
            }
        });
        eliminarPrimeroButton.addActionListener(e -> {
            lista.eliminarInicio();
            update();
        });
    }

    public ActionListener insertar() {
        return e -> {
            lista.insertar(Integer.parseInt(input.getText()));
            input.setText("");
            update();
        };
    }

    public void update() {
        out.setText(lista.getLista());
        outSize.setText("Tamaño: " + lista.contarNodos());
    }
}
