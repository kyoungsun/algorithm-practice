package com.ksnote.leetcode;

import java.util.*;

public class Question819 {
    private final static String DELIMITER = " ";

    public String mostCommonWord(String paragraph, String[] banned) {
        List<String> words = new ArrayList<>(
                Arrays.asList(
                        paragraph.toLowerCase()
                        .replaceAll("[^a-zA-Z0-9]+", " ")
                        .split(DELIMITER)));
        words.removeAll(Arrays.asList(banned));

        String mostCommonWord = words.get(0);
        int maxCount = 0;

        for (String first : words) {
            int count = 0;
            for (String second : words) {
                if (Objects.equals(first, second)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostCommonWord = first;
            }
        }

        return mostCommonWord;
    }

}
