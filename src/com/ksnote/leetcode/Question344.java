package com.ksnote.leetcode;

public class Question344 {

    public static void main(String[] args) {
	    // write your code here
        Solution solution = new Solution();
//        char[] s = {'h', 'e', 'l', 'l', 'o'};
//        solution.reverseString(s);
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(s);
    }

    static class Solution {
        public void reverseString(char[] s) {
            int left = 0;
            int right = s.length - 1;
            while (left < right) {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
        }
    }
}
