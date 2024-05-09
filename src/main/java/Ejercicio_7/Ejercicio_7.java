package Ejercicio_7;

import Common.Exercise;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_7 implements Exercise {
    private BinomialCoefficientCalculator calculator;

    public Ejercicio_7() {
        this.calculator = new BinomialCoefficientCalculator();
    }

    @Override
    public void execute() {
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false); // El usuario no puede editar el contenido
        JScrollPane scrollPane = new JScrollPane(textArea); // Agrega un scroll en caso de que el contenido sea muy largo

        JFrame frame = new JFrame("Ejercicio 7");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        // Botón para calcular el coeficiente binomial
        JButton calculateButton = new JButton("Ejercicio 7");
        calculateButton.addActionListener(e -> {
            try {
                int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de n:"));
                int k = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de k:"));
                textArea.append("Has introducido: n = " + n + ", k = " + k + "\n");
                if (n >= k) {
                    int result = calculator.calculate(n, k);
                    textArea.append("Fórmula: C(n, k) = C(n-1, k) + C(n-1, k-1) si n>k>0\n");
                    textArea.append("Valores sustituidos: C(" + n + ", " + k + ") = C(" + (n-1) + ", " + k + ") + C(" + (n-1) + ", " + (k-1) + ")\n");
                    textArea.append("Resultado: C(" + n + ", " + k + ") = " + result + "\n\n");
                } else {
                    JOptionPane.showMessageDialog(frame, "El valor de n debe ser mayor o igual que k.");
                    textArea.append("\n"); // Añade una línea en blanco
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Esta fórmula solo admite valores enteros.");
            }
        });

        // Botón para volver al menú principal
        JButton backButton = new JButton("Menú Principal");
        backButton.addActionListener(e -> frame.dispose());

        // Panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(calculateButton);
        buttonPanel.add(backButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}