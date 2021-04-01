package week_2;
import java.lang.*;
import java.util.*;

public class MergeArraysCheck {
    public static void main(String[] args) {
        int[] first = {2,3,4,6};
        int[] second = {1,5,7};
        System.out.println(mergeArrays(first,second));

    }
        public static int[] mergeArrays(int[] a1, int[] a2) {

            int[] result = new int [a1.length + a2.length];
            int one = 0;
            int two = 0;

            for (int i = 0; i < result.length; i++)
            {
                if (two >= a2.length || one < a1.length && a1[one] < a2[two]) {
                    result[i] = a1[one];
                    one++;
                } else {
                    result[i] = a2[two];
                    two++;
                }
            }

            return result;

        }
}
