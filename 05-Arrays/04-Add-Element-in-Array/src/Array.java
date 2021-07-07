public class Array {
    
    private int[] array;
    private int size;

    //构造函数，传入数组的容量capcacity构造Array
    public Array(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    //无参数的构造函数，默认数组的容量capacity = 10
    public Array() {
        this(10);
    }

    //获取数组的容量
    public getCapacity() {
        return array.length;
    }

    //获取数组中元素的个数
    public getSize() {
        return size;
    }

    //返回数组是否为空
    public isEmpty() {
        return size == 0;
    }

    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("Add failed. Array is full");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size");
        }
        for (int i = size - 1; i <= index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = e;
        size++;
    }
}
