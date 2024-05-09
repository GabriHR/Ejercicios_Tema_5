package Ejercicio_1;

import Common.Exercise;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Ejercicio_1 implements Exercise {
    @Override
    public void execute() {
        NaturalNumberSumCalculator calculator = new RecursiveNaturalNumberSumCalculator();
        int sum = calculator.calculateSum(10);

        JFrame frame = new JFrame("Ejercicio 1");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel("La suma de los primeros 10 números naturales es: " + sum), BorderLayout.CENTER);

        // Botón para volver al menú principal
        JButton backButton = new JButton("Menú Principal");
        backButton.addActionListener(e -> frame.dispose());
        panel.add(backButton, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}