public class InsertSort {
    private InsertSort() {}

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i - 1; j >= 0; --j) {
                if (arr[j] < arr[i]) {
                    insert(arr, i, j + 1);
                    break;
                }
                if (j == 0) {
                    insert(arr, i, 0);
                }
            }
            // insert(arr, i, 0);
        }
    }

    public static void insert(int[] arr, int cur, int insertIndex) {
        int t = arr[cur];
        System.out.println("t: " + t);
        for (int k = cur; k > insertIndex; --k) {
            arr[k] = arr[k - 1];
        }
        arr[insertIndex] = t;
    }

    public static void main(String[] args) {
        int[] arr = {6, 11, 100, 2, 3, 3, 7};
        InsertSort.sort(arr);
        // insert(arr, 5, 1);
        for (int e: arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}