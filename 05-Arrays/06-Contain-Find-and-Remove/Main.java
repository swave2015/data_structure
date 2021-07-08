public class Main {
    public static void main(String[] args) {
        Array arr = new Array(20);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr.toString());
        System.out.println(arr.find(3));
        System.out.println(arr.remove(4));
        System.out.println(arr.toString());
        System.out.println(arr.removeFirst());
    }
}
