package com.ashu.leetcode;

/**
 * May Challenge 2: Jewels and Stones
 */

/**
 * Problem: You're given strings J representing the types of stones that are jewels, and S
 * representing the stones you have.  Each character in S is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */

import java.util.Scanner;

/**
 * Example 1:
 *
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * Example 2:
 *
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * Note:
 *
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 */



public class JewelsAndStones {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter J: " );
        String j = sc.next();

        System.out.print("Enter S: ");
        String s = sc.next();

        System.out.print("Number of Jewels in Stones are: " + numJewelsInStones(j,s));
    }

    private static int numJewelsInStones(String J, String S) {
        char [] c = S.toCharArray();
        int count = 0;
        for (char ch : c) {
            if (J.contains(ch + "")) {
                count++;
            }
        }

        return count;
    }

}
