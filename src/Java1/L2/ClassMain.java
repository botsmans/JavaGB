package Java1.L2;

import java.util.Arrays;
import java.util.Scanner;

public class ClassMain {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]==0?1:0;
        }
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] <= 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr3));

        final int n = 5;
        int[][] arr4 = new int[n][n];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                }
            }
        }
        for (int[] line : arr4
        ) {
            for (int j : line
            ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr3
        ) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("min = " + min + " max = " + max);

        int sumLeft = 0;
        int sumRight = 0;
        boolean flag = false;
        int[] arr5 = {2, 2, 2, 1, 2, 2, 10, 1};
        for (int i : arr5
        ) {
            sumRight += i;
        }
        for (int i : arr5
        ) {
            sumLeft += i;
            sumRight -= i;
            if (sumLeft == sumRight) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else System.out.println("No");


        int[] arr6 = {0, 1, 2, 3, 4, 5, 6};
        Scanner cs = new Scanner(System.in);
        int num = cs.nextInt();
        num %= arr6.length;//что бы не крутить несколько кругов
        if (num < 0) {
            for (int i = 0; i > num; i--) {
                int firstElement = arr6[0];
                for (int j = 0; j < arr6.length - 1; j++) {
                    arr6[j] = arr6[j + 1];
                }
                arr6[arr6.length - 1] = firstElement;
            }
        } else {
            for (int i = 0; i < num; i++) {
                int lastElement = arr6[arr6.length - 1];
                for (int j = arr6.length - 1; j > 0; j--) {
                    arr6[j] = arr6[j - 1];
                }
                arr6[0] = lastElement;
            }
            System.out.println(Arrays.toString(arr6));
        }

    }
}
