package com.ajey;

import javax.swing.*;
import java.awt.*;

/*
    This is block comment

 */

public class Main {
    public static void main(String... args) {
        JFrame application = createGUI();
        application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        application.setVisible(true);
    }

    private static JFrame createGUI() {
        JTextField input = new JTextField();
        input.setPreferredSize(new Dimension(300, 40));
        JButton convertButton =  new JButton("Convert");
        JLabel output = new JLabel();
        output.setPreferredSize(new Dimension(30, 40));

        convertButton.addActionListener(event -> {
            output.setText(TestConverter.Convert(input.getText()));
        });

        JFrame gui = new JFrame("Title Case Converter");
        gui.setLayout(new FlowLayout());
        gui.add(input);
        gui.add(convertButton);
        gui.add(output);
        gui.pack();
        gui.setLocationRelativeTo(null);
        return gui;
    }
}
