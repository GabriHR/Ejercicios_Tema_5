package Ejercicio_13;

import Common.Exercise;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio_13 implements Exercise {
    private final List<Date> dates = new ArrayList<>();
    private final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public void execute() {
        JFrame frame = new JFrame("Ejercicio 13");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        JButton executeButton = new JButton("Ejecutar");
        executeButton.addActionListener(e -> {
            for (int i = 0; i < 10; i++) { // Generar 10 fechas aleatorias
                long minDay = LocalDate.of(1900, 1, 1).toEpochDay();
                long maxDay = LocalDate.of(2020, 12, 31).toEpochDay();
                long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
                Date date = Date.from(LocalDate.ofEpochDay(randomDay).atStartOfDay(ZoneId.systemDefault()).toInstant());
                dates.add(date);
            }
        });

        JButton sortAndPrintButton = new JButton("Ordenar y mostrar");
        sortAndPrintButton.addActionListener(e -> {
            Date[] datesArray = dates.toArray(new Date[0]);
            Mejora_Algoritmos.quickSort(datesArray, 0, datesArray.length - 1, true);
            dates.clear();
            Collections.addAll(dates, datesArray);
            for (Date date : dates) {
                System.out.println(format.format(date));
            }
        });

        JButton listButton = new JButton("Listar fechas");
        listButton.addActionListener(e -> {
            StringBuilder message = new StringBuilder();
            for (Date date : dates) {
                message.append(format.format(date)).append("\n");
            }
            JOptionPane.showMessageDialog(frame, message.toString());
        });

        JButton backButton = new JButton("Menú Principal");
        backButton.addActionListener(e -> frame.dispose());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 0, 10, 0);
        frame.add(executeButton, constraints);

        constraints.gridy = 1;
        frame.add(sortAndPrintButton, constraints);

        constraints.gridy = 2;
        frame.add(listButton, constraints);

        constraints.gridy = 3;
        frame.add(backButton, constraints);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}