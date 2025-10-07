package homework.dynamicarray;

public class DynamicArray {
    private int[] array = new int[0];
    private int size = 0;

    public void add(int... value) {
        if (value.length > 0) {
            for (int i : value) {
                if (size > array.length - 1) {
                    extend();
                }
                array[size++] = i;
            }
        }
    }

    private void extend() {
        int[] tmp = new int[size + 1];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public int getByIndex(int index) {
        if (index > array.length - 1) {
            return -1;
        } else {
            return array[index];
        }
    }

    public void deleteByIndex(int index) {
        if (index > array.length - 1) {
            System.out.println("Index doesn't have number");
        } else {
            int[] tmp = new int[array.length - 1];
            int temp = 0;
            for (int i = 0; i < tmp.length; i++) {
                if (i == index) {
                    temp++;
                }
                tmp[i] = array[temp];
                temp++;
            }
            array = tmp;
        }
    }

    public void set(int index, int value) {
        if (index > array.length - 1) {
            System.out.println("Index doesn't have number");
        } else {
            array[index] = value;
        }
    }

    public void add(int index, int value) {
        if (index > array.length - 1) {
            System.out.println("Index doesn't have number");

        } else {
            int temp;
            temp = array[array.length - 1];
            extend();
            for (int i = array.length - 1; i >= index + 1; i--) {
                array[i] = temp;
                if (i - 2 < 0) break;
                temp = array[i - 2];
            }
            array[index] = value;
        }
    }

    public boolean exists(int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}