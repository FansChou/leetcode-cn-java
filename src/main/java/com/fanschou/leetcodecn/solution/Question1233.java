package com.fanschou.leetcodecn.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/remove-sub-folders-from-the-filesystem/">[1233] 删除子文件夹</a><br />
 * @author fanzhou
 */
public class Question1233 {

    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        ans.add(folder[0]);
        for (int i = 1; i < folder.length; i++) {
            String s = folder[i];
            String last = ans.getLast();
            if (!s.startsWith(last) || s.charAt(last.length()) != '/') {
                ans.add(s);
            }
        }
        return ans;
    }
}
