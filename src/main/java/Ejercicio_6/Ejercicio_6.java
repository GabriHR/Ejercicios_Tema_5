package Ejercicio_6;

import Common.Exercise;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_6 implements Exercise {
    private HexadecimalToDecimalConverter converter;

    public Ejercicio_6() {
        this.converter = new HexadecimalToDecimalConverter();
    }

    @Override
    public void execute() {
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false); // El usuario no puede editar el contenido
        JScrollPane scrollPane = new JScrollPane(textArea); // Agrega un scroll en caso de que el contenido sea muy largo

        JFrame frame = new JFrame("Ejercicio 6");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        // Botón para convertir un número hexadecimal a decimal
        JButton convertButton = new JButton("Conversor");
        convertButton.addActionListener(e -> {
            String hex = JOptionPane.showInputDialog("Introduce un número hexadecimal:");
            int decimal = converter.convert(hex, hex.length());
            textArea.append("Hexadecimal: " + hex + "\n");
            textArea.append("Decimal: " + decimal + "\n\n");
        });

        // Botón para volver al menú principal
        JButton backButton = new JButton("Menú Principal");
        backButton.addActionListener(e -> frame.dispose());

        // Panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(convertButton);
        buttonPanel.add(backButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}