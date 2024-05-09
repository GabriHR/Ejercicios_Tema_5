import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

import Common.Exercise;
import Ejercicio_1.Ejercicio_1;
import Ejercicio_2.Ejercicio_2;
import Ejercicio_3.Ejercicio_3;
import Ejercicio_4.Ejercicio_4;
import Ejercicio_5.MaxValueCalculator;
import Ejercicio_6.Ejercicio_6;
import Ejercicio_7.Ejercicio_7;
import Ejercicio_8.Ejercicio_8;
import Ejercicio_9.Ejercicio_9;
import Ejercicio_10.Ejercicio_10;
import Ejercicio_11.Ejercicio_11;
import Ejercicio_12.Ejercicio_12;
import Ejercicio_13.Ejercicio_13;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicios");
        frame.setSize(960, 760);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(14, 1));

        Exercise[] exercises = new Exercise[] {
                new Ejercicio_1(), // Ejercicio 1
                new Ejercicio_2(), // Ejercicio 2
                new Ejercicio_3(), // Ejercicio 3
                new Ejercicio_4(), // Ejercicio 4
                new MaxValueCalculator(), //Ejercicio 5
                new Ejercicio_6(), // Ejercicio 6
                new Ejercicio_7(), // Ejercicio 7
                new Ejercicio_8(), // Ejercicio 8
                new Ejercicio_9(), // Ejercicio 9
                new Ejercicio_10(), // Ejercicio 10
                new Ejercicio_11(), // Ejercicio 11
                new Ejercicio_12(), // Ejercicio 12
                new Ejercicio_13(), // Ejercicio 13

                // Aquí van los demás ejercicios...
        };

        for (int i = 0; i < exercises.length; i++) {
            JButton button = new JButton("Ejercicio " + (i + 1));
            int finalI = i;
            button.addActionListener(e -> exercises[finalI].execute());
            frame.add(button);
        }

        // Botón para salir del programa
        JButton exitButton = new JButton("Salir");
        exitButton.addActionListener(e -> System.exit(0));
        frame.add(exitButton);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}