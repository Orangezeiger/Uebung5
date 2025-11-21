package h2;

import java.util.Arrays;

public class H2_main {
    public static void main(String[] args) {
        int n = 1342, digits = 15;
        int[] a = {0,0,0,0,0,0,0,0,0};
        int copy = n;

        digits = Integer.toString(n).length();

        for (int i = 8; i >= 0; i--) {
            while (copy / Math.pow(10, i) >= 1) {
                copy -= (int) Math.pow(10,i);

                a[8 - i] = a[8 - i] + 1;
            }
        }

        System.out.println(n);
        System.out.println();

        System.out.println("Digits : " + digits);
        System.out.println();

        System.out.println(Arrays.toString(a));
    }
}
