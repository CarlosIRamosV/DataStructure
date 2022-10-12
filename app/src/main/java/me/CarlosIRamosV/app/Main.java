package me.CarlosIRamosV.TDAVector;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Ui ui = new Ui();
        JFrame frame = new JFrame("TDAVector");
        frame.setContentPane(ui.contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1280, 720);
    }
}

