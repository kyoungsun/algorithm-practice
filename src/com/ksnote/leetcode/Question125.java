package com.ksnote.leetcode;

public class Question125 {

    public static void main(String[] args) {
	    // write your code here
        Solution solution = new Solution();
//        String input = "A man, a plan, a canal: Panama";
//        System.out.println("result: " + solution.isPalindrome(input));
        String input = "ab_a";
        System.out.println("result: " + solution.isPalindrome(input));
    }

    static class Solution {
        public boolean isPalindrome(String s) {
            // 대소문자 구분X, 영문자와 숫자만 허용
            String match = "[^0-9a-zA-Z]";
            String filtered = s.replaceAll(match, "").toLowerCase();
            byte[] input = filtered.getBytes();
            byte[] converted = new byte[input.length];
            for (int i = 0, n = input.length; i < n; i++) {
                converted[i] = input[n-i-1];
            }
            return filtered.equals(new String(converted));
        }
    }
}
