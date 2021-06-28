package com.ksnote.leetcode.q937;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Question937 {
    public String[] reorderLogFiles(String[] logs) {
        List<Log> digits = new ArrayList<>();
        List<Log> letters = new ArrayList<>();
        for (String str : logs) {
            Log log = new Log(str);
            if (log.isDigit()) {
                digits.add(log);
            } else {
                letters.add(log);
            }
        }

        letters.sort((o1, o2) -> {
            int compare = o1.getValues().compareTo(o2.getValues());
            if (compare == 0) {
                return o1.getIdentifier().compareTo(o2.getIdentifier());
            }
            return compare;
        });

        List<String> sorted = new ArrayList<>();
        for (Log log : letters) {
            sorted.add(log.toString());
        }
        for (Log log : digits) {
            sorted.add(log.toString());
        }

        return sorted.toArray(new String[sorted.size()]);
    }



    class Log {
        private static final String DELIMITER = " ";
        String[] values;

        public Log(String log) {
            this.values = log.split(DELIMITER);
        }

        public boolean isDigit() {
            for (int i = 1, n = values.length; i < n; i++) {
                char[] chars = values[i].toCharArray();
                for (char c : chars) {
                    if (!Character.isDigit(c)) {
                        return false;
                    }
                }
            }

            return true;
        }

        public String getIdentifier() {
            return values[0];
        }

        public String getValues() {
            StringJoiner joiner = new StringJoiner(DELIMITER);
            for (int i = 1, n = values.length; i < n; i++) {
                joiner.add(values[i]);
            }

            return joiner.toString();
        }

        public String toString() {
            StringJoiner joiner = new StringJoiner(DELIMITER);
            for (String str : values) {
                joiner.add(str);
            }

            return joiner.toString();
        }
    }

}
