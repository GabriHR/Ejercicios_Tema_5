package Ejercicio_4;

import Common.Exercise;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Ejercicio_4 implements Exercise {
    @Override
    public void execute() {
        PowerCalculator calculator = new PowerCalculator();
        int x = 2;
        int y = 3;
        int result = calculator.calculate(x, y);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setText(calculator.getOperations() + "El resultado de mi función recursiva es: " + result);

        JFrame frame = new JFrame("Ejercicio 4");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Botón para volver al menú principal
        JButton backButton = new JButton("Menú Principal");
        backButton.addActionListener(e -> frame.dispose());
        panel.add(backButton, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}