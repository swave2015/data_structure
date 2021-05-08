public class SelectionSort {
    private SelectionSort() {}
    
    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int minIndex = i;
            for (int j = i; j < arr.length; ++j) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 10, 2, 1, 9};
        SelectionSort.sort(arr);
        for (int i: arr) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}