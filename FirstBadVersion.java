package com.ashu.leetcode;

import java.util.Scanner;

public class FirstBadVersion extends VersionControl {

    /**
     * Problem 1: First Bad Version
     *
     * Statement: You are a product manager and currently leading a team to develop a new product.
     * Unfortunately, the latest version of your product fails the quality check. Since each version
     * is developed based on the previous version, all the versions after a bad version are also bad.
     *
     * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which
     * causes all the following ones to be bad.
     *
     * You are given an API bool isBadVersion(version) which will return whether version is bad.
     * Implement a function to find the first bad version. You should minimize the number of calls to the API.
     */

    /*
    Example:
    Given n = 5, and version = 4 is the first bad version.
    call isBadVersion(3) -> false
    call isBadVersion(5) -> true
    call isBadVersion(4) -> true

    Then 4 is the first bad version.
     */

    static VersionControl v;

    public static void main(String [] args) {
        v = new VersionControl();
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter first bad version: " );

        int a = sc.nextInt();
        v.setFirstBadVersion(a);

        System.out.print("Enter n: " );
        int b = sc.nextInt();

        System.out.println("First Bad Version is: ");
        System.out.println(firstBadVersion(b));

    }

    private static int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (v.isBadVersion(mid)) {
                if (!v.isBadVersion(mid - 1)) {
                    return mid;
                }
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;

    }

}
