package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/compare-version-numbers/">[165] 比较版本号</a><br />
 * @author fanzhou
 */
public class Question0165 {

    public int compareVersion(String version1, String version2) {
        String[] a = version1.split("\\.");
        String[] b = version2.split("\\.");
        int n = a.length;
        int m = b.length;
        for (int i = 0; i < n || i < m; i++) {
            int ver1 = i < n ? Integer.parseInt(a[i]) : 0;
            int ver2 = i < m ? Integer.parseInt(b[i]) : 0;
            if (ver1 != ver2) {
                return ver1 < ver2 ? -1 : 1;
            }
        }
        return 0;
    }

}
