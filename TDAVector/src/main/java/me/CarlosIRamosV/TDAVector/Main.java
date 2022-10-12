package me.CarlosIRamosV.TDAVector;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        int width = 853;
        int height = 480;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = new Dimension(width, height);

        // Create the main window
        JFrame mainScreen = new JFrame();
        mainScreen.setContentPane(new Ui().contentPane);
        mainScreen.setBounds(screenSize.width / 2 - frameSize.width / 2,
                screenSize.height / 2 - frameSize.height / 2,
                frameSize.width, frameSize.height);
        mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainScreen.setVisible(true);
    }
}

