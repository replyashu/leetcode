package com.ashu.leetcode;

/**
 * Number Complement
 */

/**
 * Given a positive integer num, output its complement number.
 * The complement strategy is to flip the bits of its binary representation.
 */

/**
 * Example 1:
 *
 * Input: num = 5
 * Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010.
 * So you need to output 2.
 * Example 2:
 *
 * Input: num = 1
 * Output: 0
 * Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0.
 * So you need to output 0.
 */

import java.util.Scanner;

/**
 * Constraints:
 *
 * The given integer num is guaranteed to fit within the range of a 32-bit signed integer.
 * num >= 1
 * You could assume no leading zero bit in the integer’s binary representation.
 * This question is the same as 1009: https://leetcode.com/problems/complement-of-base-10-integer/
 */

public class NumberCompliment {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num: ");
        int n = scanner.nextInt();

        System.out.print("Compliment of " + n + " is: ");
        System.out.print(findComplement(n));
    }

    private static int findComplement(int num) {

        String s = computeBinaryComplement(num);
        return binaryToInteger(Long.parseLong(s));
    }

    private static String computeBinaryComplement(int n) {
        if (n > 1) {
            computeBinaryComplement(n/2);
        }

        if (n % 2 == 0) {
            sb.append(1);
        } else {
            sb.append(0);
        }

        return sb.toString();
    }

    private static int binaryToInteger(long n) {
        int dec_value = 0;

        int base = 1;

        long temp = n;
        while (temp > 0) {
            long last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        return dec_value;
    }
}

