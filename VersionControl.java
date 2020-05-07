package com.ashu.leetcode;

public class VersionControl {

    int badVersion;

    boolean isBadVersion(int version) {
        if (version >= badVersion) {
            return true;
        }

        return false;
    }

    void setFirstBadVersion(int n) {
        this.badVersion = n;
    }

    int getFirstBadVersion() {
        return this.badVersion;
    }
}
