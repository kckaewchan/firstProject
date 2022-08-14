import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println(secMax(new int[] {4, 781, 8, 99, 103})); // 103
        System.out.println(secMax(new int[] {1, 2, 3, 4, 5})); // 4
        System.out.println(secMax(new int[] {3, 4})); // 3

        System.out.println("------");
        System.out.println(secMin(new int[] {4, 781, 8, 99, 103})); // 8
        System.out.println(secMin(new int[] {1, 2, 3, 4, 5})); // 2
        System.out.println(secMin(new int[] {3, 4})); // 4

        System.out.println("------");
        System.out.println(nMax(new int[] {4, 3, 2, 8, 9, 5}, 1)); // 9
        System.out.println(nMax(new int[] {4, 3, 2, 8, 9, 5}, 2)); // 8
        System.out.println(nMax(new int[] {4, 3, 2, 8, 9, 5}, 3)); // 5
        System.out.println(nMax(new int[] {4, 3, 2, 8, 9, 5}, 100)); // 0
    }

    /**
     * secMax({4, 781, 8, 99, 103})  -> 103
     * secMax({1, 2, 3, 4, 5})       -> 4
     * secMax({3, 4})                -> 3
     */
    public static int secMax(int[] arr) {
        // 1. Find index of the biggest element
        int maxIndex = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }

        // assume that second max is the smallest possible value for int
        // it is done to make we do not get real max by different assumption
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // i not equals to maxIndex will ensure not to get the biggest element.
            if (i != maxIndex && secondMax < arr[i]) {
                secondMax = arr[i];
            }
        }

        // return second biggest
        return secondMax;
    }

    /**
     * secMin({4, 781, 8, 99, 103})  -> 8
     * secMin({1, 3, 2, 4, 5})       -> 2
     * secMin({3, 4})                -> 4
     *
     * if interviewer allows sorting it will the easiest solution for secondMax and secondMin
     * if sorting not allowed then use above approach for second min as well.
     */
    public static int secMin(int[] numArr) {
        // sort an array
        Arrays.sort(numArr);

        // return second element. Array is soreted from smallest to biggest
        return numArr[1];
    }

    /**
     * Return n biggest value from array.
     *
     * nMax([4, 3, 2, 8, 9, 5], 1);   -> 9
     * nMax([4, 3, 2, 8, 9, 5], 2);   -> 8
     * nMax([4, 3, 2, 8, 9, 5], 3);   -> 5
     * nMax([4, 3, 2, 8, 9, 5], 100); -> 0
     */
    public static int nMax(int[] arr, int n) {
        // handle negative case
        if (n > arr.length || n < 1) {
            return 0;
        }
        // sort array
        Arrays.sort(arr);

        // return n the biggest n value by using array length and n
        return arr[arr.length - n];
    }
}
