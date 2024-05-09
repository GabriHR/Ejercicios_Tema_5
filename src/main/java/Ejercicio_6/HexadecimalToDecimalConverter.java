package Ejercicio_6;

public class HexadecimalToDecimalConverter {
    public int convert(String hex, int length) {
        if (length == 1) {
            return Character.digit(hex.charAt(0), 16);
        } else {
            return Character.digit(hex.charAt(length - 1), 16) + (16 * convert(hex, length - 1));
        }
    }
}