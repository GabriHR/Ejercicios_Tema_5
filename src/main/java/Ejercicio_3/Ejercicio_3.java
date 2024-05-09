package Ejercicio_3;

import Common.Exercise;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio_3 implements Exercise {
    private final Random random = new Random();
    private final List<Integer> numbers = new ArrayList<>();

    @Override
    public void execute() {
        JFrame frame = new JFrame("Ejercicio 3");
        frame.setSize(500, 300); // Aumentar el tamaño de la ventana
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        JTextArea numberList = new JTextArea();
        numberList.setEditable(false);

        JButton generateButton = new JButton("Generar número aleatorio");
        generateButton.addActionListener(e -> {
            int digits = random.nextInt(9) + 1; // Generar entre 1 y 10 dígitos
            int number = random.nextInt((int) Math.pow(10, digits)); // Generar número aleatorio con la cantidad de dígitos generada
            numbers.add(number);
            numberList.append("Número aleatorio con " + digits + " dígitos: " + number + "\n");
        });

        JButton backButton = new JButton("Menú Principal");
        backButton.addActionListener(e -> frame.dispose());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1.0; // Dar más espacio a la lista en la dirección X
        constraints.weighty = 1.0; // Dar más espacio a la lista en la dirección Y
        frame.add(new JScrollPane(numberList), constraints);

        constraints.gridy = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        frame.add(generateButton, constraints);

        constraints.gridy = 2;
        frame.add(backButton, constraints);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}