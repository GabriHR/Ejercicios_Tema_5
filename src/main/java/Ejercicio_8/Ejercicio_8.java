package Ejercicio_8;

import Common.Exercise;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ejercicio_8 implements Exercise {
    private static final String DNA_BASES = "ATGC";
    private static final int MIN_DNA_LENGTH = 100; // Longitud mínima de la cadena de ADN
    private static final int MAX_DNA_LENGTH = 800; // Longitud máxima de la cadena de ADN
    private static final String START_CODON = "ATG";

    private String dna;
    private Random random;

    public Ejercicio_8() {
        this.random = new Random();
        this.dna = generateRandomDna();
    }

    private String generateRandomDna() {
        this.random = new Random(); // Genera una nueva instancia de Random
        int dnaLength = MIN_DNA_LENGTH + random.nextInt(MAX_DNA_LENGTH - MIN_DNA_LENGTH + 1); // Genera una longitud aleatoria para la cadena de ADN
        StringBuilder dna = new StringBuilder(dnaLength);
        for (int i = 0; i < dnaLength; i++) {
            dna.append(DNA_BASES.charAt(random.nextInt(DNA_BASES.length())));
        }
        return dna.toString();
    }

    private int countGenes() {
        int count = 0;
        int index = 0;
        while ((index = dna.indexOf(START_CODON, index)) != -1) {
            count++;
            index += START_CODON.length();
        }
        return count;
    }

    @Override
    public void execute() {
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JFrame frame = new JFrame("Ejercicio 8");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        JButton calculateButton = new JButton("Generador ADN");
        calculateButton.addActionListener(e -> {
            this.dna = generateRandomDna(); // Genera una nueva cadena de ADN aleatoria
            textArea.append("Cadena de ADN: " + dna + "\n");
            textArea.append("Número de genes: " + countGenes() + "\n\n");
        });

        JButton backButton = new JButton("Menú Principal");
        backButton.addActionListener(e -> frame.dispose());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(calculateButton);
        buttonPanel.add(backButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}