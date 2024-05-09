package Ejercicio_13;

import java.util.Date;

public class Mejora_Algoritmos {

    public static void quickSort(Date[] arr, int low, int high, boolean ascendente) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high, ascendente);
            quickSort(arr, low, pivotIndex - 1, ascendente);
            quickSort(arr, pivotIndex + 1, high, ascendente);
        }
    }

    private static int partition(Date[] arr, int low, int high, boolean ascendente) {
        Date pivotValue = arr[high];
        int storeIndex = low;
        for (int i = low; i < high; i++) {
            if (ascendente ? arr[i].before(pivotValue) : arr[i].after(pivotValue)) {
                swap(arr, i, storeIndex);
                storeIndex++;
            }
        }
        swap(arr, storeIndex, high);
        return storeIndex;
    }

    private static void swap(Date[] arr, int i, int j) {
        Date temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}