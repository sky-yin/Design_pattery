package algorithm.leetCode;

/**
 * 寻找最长回文字符串
 * 用中心点，进行左右移位，然后发现最长回文串
 */

public class LongestPalindromicSubstring {

    public String longestPalindrome(String string) {
        if (string.isEmpty() || string.length() == 1){
            return string;
        }

        String longest = string.substring(0,1);

        for (int i = 0; i < string.length(); i++) {
            String tmp = helper(string,i,i);
            if (tmp.length()>longest.length()){
                longest = tmp;
            }
        }
        for (int i = 0; i < string.length(); i++) {
            String tmp = helper(string,i,i+1);
            if (tmp.length()>longest.length()){
                longest = tmp;
            }
        }

        return longest;
    }


    public String helper(String s,int begin,int end){
        while (begin >= 0 && end<s.length() && s.charAt(begin) == s.charAt(end)){
            begin--;
            end++;
        }

        String temp = s.substring(begin+1,end);

        return temp;
    }
}
