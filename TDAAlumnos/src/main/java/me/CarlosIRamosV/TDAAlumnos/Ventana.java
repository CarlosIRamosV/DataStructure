package me.CarlosIRamosV.TDAAlumnos;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Clase que implementa la interfaz gráfica del TDA Vector
 *
 * @author Carlos Ramos
 * @version 1.0
 */
public class Ventana {
    private final TDAAlumnos lista;
    public JPanel contentPanel;
    private JButton agregarButton;
    private JTextField addNoControl;
    private JTextField addNombre;
    private JTextField addCarrera;
    private JButton forward;
    private JButton backward;
    private JLabel salidaNoControl;
    private JLabel salidaNombre;
    private JLabel salidaCarrera;
    private JButton eliminarButton;
    private JTextField eliminarNoControl;
    private Nodo aux;

    public Ventana() {
        lista = new TDAAlumnos();
        forward.setEnabled(false);
        backward.setEnabled(false);
        eliminarNoControl.setEnabled(false);
        eliminarButton.setEnabled(false);
        agregarButton.addActionListener(agregar());
        eliminarButton.addActionListener(eliminar());
        forward.addActionListener(e -> {
            aux = aux.getSiguiente();
            update();
        });
        backward.addActionListener(e -> {
            aux = aux.getAnterior();
            update();
        });
    }

    private ActionListener eliminar() {
        return e -> {
            if (lista.eliminar(eliminarNoControl.getText())) {
                eliminarNoControl.setText("");
                aux = lista.getInicio();
                update();
            } else {
                eliminarNoControl.setText("");
                JOptionPane.showMessageDialog(null, "No se encontró ningún alumno con ese número de control");
            }

        };
    }

    private ActionListener agregar() {
        return e -> {
            lista.agregar(addNoControl.getText(), addNombre.getText(), addCarrera.getText());
            addNoControl.setText("");
            addNombre.setText("");
            addCarrera.setText("");
            aux = lista.getInicio();
            update();
        };
    }

    public void update() {
        if (aux != null) {
            eliminarButton.setEnabled(true);
            eliminarNoControl.setEnabled(true);
            backward.setEnabled(aux.getAnterior() != null);
            forward.setEnabled(aux.getSiguiente() != null);
            salidaNoControl.setText("No. Control: " + aux.getNoCtrl());
            salidaNombre.setText("Nombre: " + aux.getNombre());
            salidaCarrera.setText("Carrera: " + aux.getCarrera());
        } else {
            salidaNoControl.setText("No. Control: ");
            salidaNombre.setText("Nombre: ");
            salidaCarrera.setText("Carrera: ");
            forward.setEnabled(false);
            backward.setEnabled(false);
            eliminarNoControl.setEnabled(false);
            eliminarButton.setEnabled(false);
        }
    }
}
