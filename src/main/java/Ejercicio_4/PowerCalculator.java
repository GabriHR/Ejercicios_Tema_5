package Ejercicio_4;

public class PowerCalculator implements Calculator {
    private StringBuilder operations = new StringBuilder();

    @Override
    public int calculate(int x, int y) {
        if (y == 0) {
            operations.append(x).append(" elevado a 0 es 1\n");
            return 1;
        } else {
            int result = x * calculate(x, y - 1);
            operations.append(x).append(" elevado a ").append(y).append(" es ").append(result).append("\n");
            return result;
        }
    }

    public String getOperations() {
        return operations.toString();
    }
}