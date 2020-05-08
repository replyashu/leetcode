package com.ashu.leetcode;

/**
 * May Challenge 3: Ransom Note
 */

/**
 * Given an arbitrary ransom note string and another string containing letters from all the magazines,
 * write a function that will return true if the ransom note can be constructed from the magazines ;
 * otherwise, it will return false.
 *
 * Each letter in the magazine string can only be used once in your ransom note.
 */

import java.util.Scanner;

/**
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 *
 *
 * Constraints:
 *
 * You may assume that both strings contain only lowercase letters.
 */

public class RansomNote {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ransom note: ");
        String r = sc.next();

        System.out.print("Enter magazine: ");
        String m = sc.next();

        System.out.print("If we can construct ransom note from magazone: " + canConstruct(r, m));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        int [] t = new int[26];

        char [] c = ransomNote.toCharArray();

        for (Character ch : c) {
            t[ch - 'a']++;
        }

        c = magazine.toCharArray();

        for (Character ch : c) {
            t[ch - 'a']--;
        }

        c = ransomNote.toCharArray();

        for (Character ch : c) {
            if (t[ch - 'a'] > 0) {
                return false;
            }
        }

        return true;
    }
}
