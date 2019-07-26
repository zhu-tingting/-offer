package Algorithms.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by zhutingting05 on 2019-07-25.
 */
public class Merge2SortedArray {
    private int[] array1;
    private int[] array2;

    public Merge2SortedArray(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }


    public int[] merge() {
        int size = array1.length + array2.length;
        int[] result = new int[size];
        int index1 = 0;
        int index2 = 0;
        int i = 0;
        for (; i < size && index1 < array1.length && index2 < array2.length; i++) {
            if (array1[index1] <= array2[index2]) {
                result[i] = array1[index1];
                index1++;
            } else {
                result[i] = array2[index2];
                index2++;
            }
        }

        if (index1 < array1.length) {
            for (; i < size; i++) {
                result[i] = array1[index1];
            }
            index1++;
        }

        if (index2 < array2.length) {
            for (; i < size; i++) {
                result[i] = array2[index2];
            }
            index2++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 3, 5, 7};
        int[] array2 = new int[]{2, 4, 6, 8};

        Merge2SortedArray merge2SortedArray = new Merge2SortedArray(array1, array2);
        int[] result = merge2SortedArray.merge();
        System.out.println(Arrays.toString(result));

    }

}
