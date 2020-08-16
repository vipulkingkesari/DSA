package dsa;

import java.util.Scanner;

public class AplusB {
	static int sumOfTwoDigits(int first_digit, int second_digit) {
        return first_digit + second_digit;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(sumOfTwoDigits(a, b));
    }

}
