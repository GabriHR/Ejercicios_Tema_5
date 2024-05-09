package Ejercicio_9;

import Common.Exercise;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio_9 implements Exercise {
    @Override
    public void execute() {
        JFrame frame = new JFrame("Ejercicio 9");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        JButton executeButton = new JButton("Ordenar archivo");
        executeButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                    List<String> lines = reader.lines().collect(Collectors.toList());

                    // Ventana para el contenido original
                    JTextArea originalTextArea = new JTextArea();
                    originalTextArea.setEditable(false);
                    JScrollPane originalScrollPane = new JScrollPane(originalTextArea);
                    JFrame originalFrame = new JFrame("Archivo original");
                    originalFrame.setSize(600, 400);
                    originalFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    originalFrame.add(originalScrollPane);
                    originalFrame.setLocationRelativeTo(null);
                    originalFrame.setVisible(true);
                    lines.forEach(line -> originalTextArea.append(line + "\n"));

                    JButton sortFileButton = new JButton("Archivo ordenado");
                    sortFileButton.addActionListener(e1 -> {
                        originalFrame.dispose();

                        // Ventana para el contenido ordenado
                        JTextArea sortedTextArea = new JTextArea();
                        sortedTextArea.setEditable(false);
                        JScrollPane sortedScrollPane = new JScrollPane(sortedTextArea);
                        JFrame sortedFrame = new JFrame("Archivo ordenado");
                        sortedFrame.setSize(600, 400);
                        sortedFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        sortedFrame.add(sortedScrollPane);
                        sortedFrame.setLocationRelativeTo(null);
                        sortedFrame.setVisible(true);
                        lines.stream()
                                .map(line -> Arrays.stream(line.split("\\P{L}+"))
                                        .map(String::toLowerCase)
                                        .sorted()
                                        .collect(Collectors.joining(" ")))
                                .forEach(line -> sortedTextArea.append(line + "\n"));

                        JButton backButton = new JButton("Menú Principal");
                        backButton.addActionListener(e2 -> {
                            sortedFrame.dispose();
                            originalFrame.dispose();
                            frame.dispose();
                        });

                        JButton chooseFileButton = new JButton("Elegir más archivos");
                        chooseFileButton.addActionListener(e2 -> {
                            sortedFrame.dispose();
                            executeButton.doClick();
                        });

                        JPanel buttonPanel = new JPanel();
                        buttonPanel.add(backButton);
                        buttonPanel.add(chooseFileButton);

                        sortedFrame.add(buttonPanel, BorderLayout.SOUTH);
                    });

                    originalFrame.add(sortFileButton, BorderLayout.SOUTH);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error al leer el archivo.");
                }
            }
        });

        JButton backButton = new JButton("Menú Principal");
        backButton.addActionListener(e -> {
            JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(executeButton);
            if (mainFrame != null) {
                mainFrame.dispose();
            }
        });

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 0, 10, 0);
        frame.add(executeButton, constraints);

        constraints.gridy = 1;
        frame.add(backButton, constraints);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}