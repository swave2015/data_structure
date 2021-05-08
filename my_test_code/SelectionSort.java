// public class SelectionSort {
//     private SelectionSort() {}
    
//     public static void swap (int[] data, int i, int j) {
//         int tmp = data[i];
//         data[i] = data[j];
//         data[j] = tmp;
//     }
//     public static void sort(int[] data) {
//         for (int i = 0; i < data.length - 1; ++i) {
//             int minIndex = i;
//             for (int j = i; j < data.length - 1; ++j) {
//                 if (data[j] < data[minIndex]) {
//                     minIndex = j;
//                 }
//             }
//             swap(data, i, minIndex);
//         }
//     }

//     public static void main(String[] args) {
//         int[] data = {7, 6, 5, 4, 3, 2, 1};
//         sort(data);
//         for (int i = 0; i < data.length; ++i) {
//             System.out.print(data[i] + " ");
//         }
//         System.out.println();
//     }
// }
