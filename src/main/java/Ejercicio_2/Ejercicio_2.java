package Ejercicio_2;

import Common.Exercise;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Ejercicio_2 implements Exercise {
    @Override
    public void execute() {
        NaturalNumberPrinter printer = new RecursiveNaturalNumberPrinter();
        String numbers = printer.printNumbers(1, 10);

        JFrame frame = new JFrame("Ejercicio 2");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel("Los números naturales del 1 al 10 son: " + numbers), BorderLayout.CENTER);

        // Botón para volver al menú principal
        JButton backButton = new JButton("Menú Principal");
        backButton.addActionListener(e -> frame.dispose());
        panel.add(backButton, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}