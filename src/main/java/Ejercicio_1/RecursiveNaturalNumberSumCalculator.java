package Ejercicio_1;

public class RecursiveNaturalNumberSumCalculator implements NaturalNumberSumCalculator {
    @Override
    public int calculateSum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + calculateSum(n - 1);
        }
    }
}