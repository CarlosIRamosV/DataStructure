package me.CarlosIRamosV.TDAVector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 * Clase que implementa la interfaz gráfica del TDA Vector
 *
 * @author Carlos Ramos
 * @version 1.0
 */
public class UserPanel {
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
    private JButton burbujaButton;
    private JButton shellButton;
    private JTextField eliminarElementoInput;
    private JTextField inputBuscarElemento;
    private JButton EliminarValorInicialButton;
    private JTextField inputInicioVector;

    public UserPanel() {
        tdaVector = new TDAVector();
        // Placeholder
        String textPlaceholder = "Ingrese un numero entero";

        enablePlaceholder(inputValorFinal, textPlaceholder);
        enablePlaceholder(inputValorPorOrden, textPlaceholder);
        enablePlaceholder(eliminarElementoInput, textPlaceholder);
        enablePlaceholder(inputBuscarElemento, textPlaceholder);

        inputValorFinal.addFocusListener(placeholder(inputValorFinal, textPlaceholder));
        inputValorPorOrden.addFocusListener(placeholder(inputValorPorOrden, textPlaceholder));
        eliminarElementoInput.addFocusListener(placeholder(eliminarElementoInput, textPlaceholder));
        inputBuscarElemento.addFocusListener(placeholder(inputBuscarElemento, textPlaceholder));

        // Input valor al final
        inputValorFinal.addActionListener(inputValorFinalActionListener());
        inputButtonValorFinal.addActionListener(inputValorFinalActionListener());

        // Input valor por orden
        inputValorPorOrden.addActionListener(inputValorByOrderActionListener());
        inputButtonValorPorOrden.addActionListener(inputValorByOrderActionListener());
        eliminarValorFinalButton.addActionListener(e -> {
            if (tdaVector.eliminarElementoFinal()) {
                ActionStatus.setText("Se elimino el valor final");
            } else {
                ActionStatus.setText("No se pudo eliminar el valor final");
            }
            updateVectorView();
        });
        burbujaButton.addActionListener(e -> {
            tdaVector.burbuja();
            updateVectorView();
        });
        shellButton.addActionListener(e -> {
            tdaVector.quickSort();
            updateVectorView();
        });
        eliminarElementoInput.addActionListener(eliminarElemento());
        inputBuscarElemento.addActionListener(e -> {
            ActionStatus.setText(tdaVector.buscarElemento(Integer.parseInt(inputBuscarElemento.getText())));
            inputBuscarElemento.setText("");
        });
        EliminarValorInicialButton.addActionListener(e -> {
            if (tdaVector.eliminarPrimerElemento()) {
                ActionStatus.setText("Se elimino el valor inicial");
            } else {
                ActionStatus.setText("No se pudo eliminar el valor inicial");
            }
            updateVectorView();
        });
        inputInicioVector.addActionListener(e -> {
            if (tdaVector.agregarPrimerElemento(Integer.parseInt(inputInicioVector.getText()))) {
                inputInicioVector.setText("");
                ActionStatus.setText("Se agrego el primer elemento");
            } else {
                ActionStatus.setText("No se pudo agregar el primer elemento");
            }
            updateVectorView();
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
                    if (tdaVector.agregarElementoFinal(Integer.parseInt(inputValorFinal.getText()))) {
                        ActionStatus.setText("Se agrego el valor: " + inputValorFinal.getText());
                        inputValorFinal.setText("");
                        updateVectorView();
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
        return e -> {
            try {
                if (tdaVector.insertarElemento(Integer.parseInt(inputValorPorOrden.getText()))) {
                    ActionStatus.setText("Se agrego el valor: " + inputValorPorOrden.getText());
                    inputValorPorOrden.setText("");
                    updateVectorView();
                } else {
                    ActionStatus.setText("Error: El vector esta lleno");
                }
            } catch (NumberFormatException exception) {
                ActionStatus.setText("Error: El valor ingresado no es un numero entero");
            }
        };
    }

    private ActionListener eliminarElemento() {
        return e -> {
            try {
                if (tdaVector.eliminarElemento(Integer.parseInt(eliminarElementoInput.getText()))) {
                    ActionStatus.setText("Se elimino el valor: " + eliminarElementoInput.getText());
                    eliminarElementoInput.setText("");
                    updateVectorView();
                } else {
                    ActionStatus.setText("Error: valor no encontrado");
                }
            } catch (NumberFormatException exception) {
                ActionStatus.setText("Error: El valor ingresado no es un numero entero");
            }
        };
    }

    private void updateVectorView() {
        vectorView.setText(tdaVector.getVector());
    }
}
