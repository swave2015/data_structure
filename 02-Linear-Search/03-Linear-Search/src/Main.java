public class Main {
    public static void main(String[] args) {
        int[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        int res1 = LinearSearch.search(data, 16);
        System.out.println(res1);
        int res2 = LinearSearch.search(data, 32);
        System.out.println(res2);
    }
}
