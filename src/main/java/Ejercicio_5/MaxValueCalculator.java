package Ejercicio_5;

import Common.Exercise;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class MaxValueCalculator implements Exercise {
    private int[] array;

    public MaxValueCalculator() {
        this.array = generateRandomArray();
    }

    private int[] generateRandomArray() {
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100); // Genera números aleatorios entre 0 y 99
        }
        return array;
    }

    public int findMax(int[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        }

        int max = findMax(array, index + 1);

        if (array[index] > max) {
            return array[index];
        } else {
            return max;
        }
    }

    @Override
    public void execute() {
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false); // El usuario no puede editar el contenido
        JScrollPane scrollPane = new JScrollPane(textArea); // Agrega un scroll en caso de que el contenido sea muy largo

        JFrame frame = new JFrame("Ejercicio 5");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        // Botón para generar un nuevo array y calcular su valor máximo
        JButton newMaxButton = new JButton("Calcular nuevo máximo");
        newMaxButton.addActionListener(e -> {
            this.array = generateRandomArray();
            int newMax = findMax(array, 0);
            textArea.append("Array: " + Arrays.toString(array) + "\n");
            textArea.append("El valor máximo en el array es: " + newMax + "\n\n");
        });

        // Botón para volver al menú principal
        JButton backButton = new JButton("Menú Principal");
        backButton.addActionListener(e -> frame.dispose());

        // Panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(newMaxButton);
        buttonPanel.add(backButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
