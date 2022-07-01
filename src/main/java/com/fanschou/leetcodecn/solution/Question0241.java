package com.fanschou.leetcodecn.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @title [241] 为运算表达式设计优先级
 *
 * @description https://leetcode.cn/problems/different-ways-to-add-parentheses/
 *
 * 给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。
 *
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 *
 * @author fanzhou
 */
public class Question0241 {

    char[] cs;

    public List<Integer> diffWaysToCompute(String s) {
        cs = s.toCharArray();
        return dfs(0, cs.length - 1);
    }

    private List<Integer> dfs(int left, int right){
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if(cs[i] >= '0' && cs[i] <= '9'){
                continue;
            }
            List<Integer> leftList = dfs(left, i - 1);
            List<Integer> rightList = dfs(i + 1, right);
            for(int a : leftList){
                for(int b : rightList){
                    int cur = 0;
                    if(cs[i] == '+'){
                        cur = a + b;
                    } else if (cs[i] == '-'){
                        cur = a - b;
                    } else {
                        cur = a * b;
                    }
                    ans.add(cur);
                }
            }
        }

        if(ans.isEmpty()){
            int cur = 0;
            for (int i = left; i <= right; i++) {
                cur = cur * 10 + (cs[i] - '0');
            }
            ans.add(cur);
        }
        return ans;
    }

}
