package Ejercicio_12;

import Common.Exercise;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio_12 implements Exercise {
    private final List<Date> dates = new ArrayList<>();
    private final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public void execute() {
        JFrame frame = new JFrame("Ejercicio 12");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        JTextField dateField = new JTextField(20);
        JButton addButton = new JButton("Agregar fecha");
        addButton.addActionListener(e -> {
            try {
                Date date = format.parse(dateField.getText());
                dates.add(date);
                Collections.sort(dates);
                dateField.setText("");
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(frame, "Fecha inválida. Use el formato dd/MM/yyyy.");
            }
        });

        JButton addRandomButton = new JButton("Agregar fecha aleatoria");
        addRandomButton.addActionListener(e -> {
            long minDay = LocalDate.of(1900, 1, 1).toEpochDay();
            long maxDay = LocalDate.of(2020, 12, 31).toEpochDay();
            long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
            Date date = Date.from(LocalDate.ofEpochDay(randomDay).atStartOfDay(ZoneId.systemDefault()).toInstant());
            dates.add(date);
            Collections.sort(dates);
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
        frame.add(dateField, constraints);

        constraints.gridy = 1;
        frame.add(addButton, constraints);

        constraints.gridy = 2;
        frame.add(addRandomButton, constraints);

        constraints.gridy = 3;
        frame.add(listButton, constraints);

        constraints.gridy = 4;
        frame.add(backButton, constraints);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}