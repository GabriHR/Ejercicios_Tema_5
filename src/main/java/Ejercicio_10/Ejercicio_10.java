package Ejercicio_10;

import Common.Exercise;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_10 implements Exercise {
    @Override
    public void execute() {
        JFrame frame = new JFrame("Ejercicio 10");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("Buscar en archivo");
        searchButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                    String line;
                    boolean found = false;
                    int lineNumber = 0;
                    int position = -1;
                    while ((line = reader.readLine()) != null) {
                        lineNumber++;
                        position = line.indexOf(searchField.getText());
                        if (position != -1) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        JOptionPane.showMessageDialog(frame, "Palabra encontrada en la línea " + lineNumber + ", posición " + position);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Palabra no encontrada");
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error al leer el archivo.");
                }
            }
        });

        JButton backButton = new JButton("Menú Principal");
        backButton.addActionListener(e -> frame.dispose());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 0, 10, 0);
        frame.add(searchField, constraints);

        constraints.gridy = 1;
        frame.add(searchButton, constraints);

        constraints.gridy = 2;
        frame.add(backButton, constraints);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}