package com.ksnote.leetcode;

import java.util.*;

public class Question49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List> groupAnagrams = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!groupAnagrams.containsKey(key)) {
                groupAnagrams.put(key, new ArrayList<>());
            }
            groupAnagrams.get(key).add(str);
        }

        return new ArrayList(groupAnagrams.values());
    }
}
