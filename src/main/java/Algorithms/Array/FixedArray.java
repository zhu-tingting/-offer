package Algorithms.Array;

import java.util.Arrays;

/**
 * Created by zhutingting05 on 2019-07-25.
 */
public class FixedArray {
    private int[] data;
    private int n;
    private int count;

    public FixedArray(int capacity) {
        this.data = new int[capacity];
        this.n = capacity;
        this.count = 0;
    }

    public int find(int index) {
        if (index < 0 || index >= count) {
            System.out.println("位置不合法");
            return -1;
        }

        return data[index];
    }

    public boolean insert(int index, int value) {
        System.out.println("insert data " + value + " in " + index);

        if (count == n) {
            System.out.println("数组已经满了，不能插入");
            return false;
        }
        if (index < 0 || index > count) {
            System.out.println("位置不合法");
            return false;
        }

        for (int i = count; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        count++;
        return true;
    }

    public boolean delete(int index) {
        System.out.println("delete data in " + index);

        if (index < 0 || index >= count) {
            System.out.println("位置不合法");
            return false;
        }

        for (int i = index; i < count - 1; i++) {
            data[i] = data[i + 1];
        }
        data[count - 1] = 0;
        count--;
        return true;
    }


    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "FixedArray{" +
                "data=" + Arrays.toString(data) +
                ", n=" + n +
                ", count=" + count +
                '}';
    }


    public static void main(String[] args) {
        FixedArray fixedArray = new FixedArray(5);
        fixedArray.insert(0, 1);
        fixedArray.insert(0, 2);
        fixedArray.insert(0, 3);
        fixedArray.insert(0, 4);
        fixedArray.insert(0, 5);
        fixedArray.insert(0, 6);
        fixedArray.print();

        System.out.println(fixedArray.find(0));
        fixedArray.delete(0);
        fixedArray.print();

    }

}
