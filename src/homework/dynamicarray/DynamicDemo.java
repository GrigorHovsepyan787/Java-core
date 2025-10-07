package homework.dynamicarray;

public class DynamicDemo {
    public static void main(String[] args) {
        DynamicArray test = new DynamicArray();
        test.add(11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27);

        test.deleteByIndex(4);
        test.print();

    }
}
