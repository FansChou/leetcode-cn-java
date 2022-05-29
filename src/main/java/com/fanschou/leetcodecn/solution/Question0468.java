package com.fanschou.leetcodecn.solution;

/**
 * @title [468] 验证IP地址
 *
 * @description https://leetcode.cn/problems/validate-ip-address/
 *
 * 给定一个字符串 queryIP。如果是有效的 IPv4 地址，返回 "IPv4" ；如果是有效的 IPv6 地址，返回 "IPv6" ；如果不是上述类型的 IP 地址，返回 "Neither" 。
 *
 * @author fanzhou
 */
public class Question0468 {

    public String validIPAddress(String ip) {
        if (ip.contains(".") && check4(ip)) {
            return "IPv4";
        }
        if (ip.contains(":") && check6(ip)) {
            return "IPv6";
        }
        return "Neither";
    }
    boolean check4(String ip) {
        int n = ip.length();
        int cnt = 0;
        char[] cs = ip.toCharArray();
        for (int i = 0; i < n && cnt <= 3; ) {
            // 找到连续数字段，以 x 存储
            int j = i;
            int x = 0;
            while (j < n && cs[j] >= '0' && cs[j] <= '9' && x <= 255) {
                x = x * 10 + (cs[j++] - '0');
            }
            // 非 item 字符之间没有 item
            if (i == j) {
                return false;
            }
            // 含前导零 或 数值大于 255
            if ((j - i > 1 && cs[i] == '0') || (x > 255)) {
                return false;
            }
            i = j + 1;
            if (j == n) {
                continue;
            }
            // 存在除 . 以外的其他非数字字符
            if (cs[j] != '.') {
                return false;
            }
            cnt++;
        }
        // 恰好存在 3 个不位于两端的 .
        return cnt == 3 && cs[0] != '.' && cs[n - 1] != '.';
    }
    boolean check6(String ip) {
        int n = ip.length();
        int cnt = 0;
        char[] cs = ip.toCharArray();
        for (int i = 0; i < n && cnt <= 7; ) {
            int j = i;
            while (j < n && ((cs[j] >= 'a' && cs[j] <= 'f') || (cs[j] >= 'A' && cs[j] <= 'F') || (cs[j] >= '0' && cs[j] <= '9'))) {
                j++;
            }
            // 非 item 字符之间没有 item 或 长度超过 4
            if (i == j || j - i > 4) {
                return false;
            }
            i = j + 1;
            if (j == n) {
                continue;
            }
            // 存在除 : 以外的其他非数字字符
            if (cs[j] != ':') {
                return false;
            }
            cnt++;
        }
        // 恰好存在 7 个不位于两段的 :
        return cnt == 7 && cs[0] != ':' && cs[n - 1] != ':';
    }
}
