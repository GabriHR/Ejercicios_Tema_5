package Ejercicio_3;

public class RecursiveDigitCounter implements DigitCounter {
    @Override
    public int countDigits(int number) {
        if (number < 10 && number > -10) {
            return 1;
        } else {
            return 1 + countDigits(number / 10);
        }
    }
}