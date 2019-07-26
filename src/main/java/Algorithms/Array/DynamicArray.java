package Algorithms.Array;


import java.util.Arrays;

/**
 * 实现一个支持动态扩容的数组
 * Created by zhutingting05 on 2019-07-25.
 */
public class DynamicArray {

    private int[] data;
    private int n;
    private int count;

    public DynamicArray(int capacity) {
        this.data = new int[capacity];
        this.n = capacity;
        this.count = 0;
    }

    public int find(int index) {
        System.out.println("find value of index:" + index);
        if (index < 0 || index > count) {
            System.out.println("下标不在数组长度范围内");
            return 0;
        }

        return data[index];

    }

    /**
     * 数组末尾插入元素
     *
     * @param value
     */
    public boolean insert(int value) {
        System.out.println("insert value:" + value);
        //数组还有空间
        if (count < n) {
            data[count] = value;
            count++;
            return true;
        }
        //数组没有空间了，需要进行扩容后增加元素
        int[] temp = new int[2 * n];
        n = 2 * n;
        for (int i = 0; i < count; i++) {
            temp[i] = data[i];
        }
        data = temp;
        data[count] = value;
        count++;
        return true;
    }

    /**
     * 删除指定位置元素
     *
     * @param index
     * @return
     */
    public boolean delete(int index) {
        System.out.println("delete value of index " + index);

        if (index < 0 || index > count) {
            System.out.println("下标不在数组长度范围内");
            return false;
        }

        //index<count,后面的数据向前挪一位
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
        return "DynamicArray{" +
                "array=" + Arrays.toString(data) +
                ", n=" + n +
                ", count=" + count +
                '}';
    }

    public static void main(String[] args) {
        DynamicArray array = new DynamicArray(5);
        for (int i = 0; i < 12; i++) {
            array.insert(i);
            array.print();
        }

        System.out.println(array.find(5));
        array.delete(5);
        array.print();
    }

}

