import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i ++) {
            E t = arr[i];
            int j;
            for (j = i; j - 1 >= 0 && t.compareTo(arr[j - 1]) < 0; j --) {
                arr[j] = arr[j - 1];
            }
            arr[j] = t;
        }
    }

    public static <E extends Comparable<E>> void sort2(E[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            E t = arr[i];
            int j;
            for (j = i; j + 1 < arr.length && t.compareTo(arr[j + 1]) > 0; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = t;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = ArrayGenerator.generateRandomArray(10, 10);
        ArrayGenerator.printArray(arr);
        sort2(arr);
        ArrayGenerator.printArray(arr);
    }
}
