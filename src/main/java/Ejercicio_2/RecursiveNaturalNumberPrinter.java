package Ejercicio_2;

public class RecursiveNaturalNumberPrinter implements NaturalNumberPrinter {
    @Override
    public String printNumbers(int a, int d) {
        StringBuilder numbers = new StringBuilder();
        printNumbersRecursive(a, d, numbers);
        return numbers.toString().trim();
    }

    private void printNumbersRecursive(int a, int d, StringBuilder numbers) {
        if (a <= d) {
            numbers.append(a).append(" ");
            printNumbersRecursive(a + 1, d, numbers);
        }
    }
}