package ai0818;

import java.util.Scanner;

public class ArrayTest01 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int[] numArr = new int[5];
        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("(%d) 정수입력: ", i + 1);
            numArr[i] = s1.nextInt();
            sum += numArr[i];
        }

        for (int i = 0; i < numArr.length; i++) {
            if (i < 4) {
                System.out.print(numArr[i] + " + ");
            } else {
                System.out.print(numArr[i] + " = ");
                System.out.print(sum);
            }
        }

        s1.close();
    }
}