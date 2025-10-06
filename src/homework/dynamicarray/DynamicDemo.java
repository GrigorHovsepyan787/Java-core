package homework.dynamicarray;

public class DynamicDemo {
    public static void main(String[] args) {
        DynamicArray test = new DynamicArray();
        test.add(11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27);
        System.out.println(test.exists(11));
        System.out.println(test.exists(112));
        System.out.println(test.getIndexByValue(13));
        System.out.println(test.getIndexByValue(131));
        test.add(16, 42);
        test.print();

    }
}
