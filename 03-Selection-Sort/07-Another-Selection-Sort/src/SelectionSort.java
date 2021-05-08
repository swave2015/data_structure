public class SelectionSort {
    private SelectionSort() {}

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = arr.length - 1; i >= 0; --i) {
            int maxIndex = i;
            for (int j = i; j >= 0; --j) {
                 if (arr[j].compareTo(arr[maxIndex]) > 0) {
                     maxIndex = j;
                 }                                                                                                               
            }
            swap(arr, maxIndex, i);
        }
    }

    private static <E> void swap(E[]arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 4, 2, 6, 7, 1, 10};
        SelectionSort.sort(arr);
        for (int e: arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
