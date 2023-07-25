package home_work2;

import java.util.Arrays;

public class home_work2_1 {
    public static void main(String[] args) {
        int[] array = new int[] {64, 42, 32, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        countSort(array, 100);
        System.out.println(Arrays.toString(array));
    }

    public static void countSort(int[] array, int maxValue) {

        int[] count = new int[maxValue + 1];

        for (int k : array) {
            count[k] = count[k] + 1;
        }

        int arrayindex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[arrayindex] = i;
                arrayindex++;
            }
        }
    }
}
