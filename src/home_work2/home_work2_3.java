package home_work2;

import java.util.Arrays;

public class home_work2_3 {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 3, 0, 5, 1};
        int[] arr2 = new int[]{2, 3, 0, 5, 1};
        shift_array(arr, 2);
        System.out.println(Arrays.toString(arr));
        shifter(arr2, 2);
        System.out.println(Arrays.toString(arr2));
    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int c = a;
            a = b;
            b = c % a;
        }
        return a;
    }

    public static void shift_array(int[] A, int n) {
        int N = A.length;
        n %= N;
        if(n < 0)
            n = N + n;
        int d = gcd(N, n);
        for(int i = 0; i < d; i++) {
            int temp = A[i];
            for(int j = i - n + N; j != i; j = (j - n + N) % N)
                A[(j + n) % N] = A[j];
            A[i + n] = temp;
        }
    }

    private static void shifter(int[] a, int n) {
        n %= a.length;
        int shift = a.length + n;
        shift %= a.length;
        for (int i = 0; i < shift; i++) {
            int temp = a[a.length - 1];
            System.arraycopy(a, 0, a, 1, a.length - 1);
            a[0] = temp;
            }
        }

}
