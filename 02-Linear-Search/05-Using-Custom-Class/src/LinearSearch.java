public class LinearSearch {
    private LinearSearch() {}

    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; ++i) {
            if (data[i].equals(target)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] data = {1, 2, 3, 4, 5, 6};
        int res1 = LinearSearch.search(data, 1);
        int res2 = LinearSearch.search(data, 2);
        System.out.println(res1);
        System.out.println(res2);
        Student[] students = {new Student("a"), 
                              new Student("b"),
                              new Student("c")};
        Student d = new Student("d");
        int res3 = LinearSearch.search(students, d);
        System.out.println(res3);
    }
}
