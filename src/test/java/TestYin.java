import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import org.checkerframework.checker.units.qual.C;
import org.junit.Test;
import util.TailInvoke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestYin {
    @Test
    public void testYin(){
        System.out.println(TailInvoke.factorialTailRecursion(1,20).invoke());
    }


    @Test
    public void listTest(){
        System.out.println(lengthOfLongest("sdfasskdekal"));
    }

    public int lengthOfLongest(String s){
        int n = s.length(), ans = 0;

        int[] index= new int[128];

        for (int i = 0,start=0; i < n; i++) {
            start = Math.max(index[s.charAt(i)],start);
            ans = Math.max(ans,i-start);
            index[s.charAt(i)] = i;
        }

        return ans;
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

    public int format(String str){
        str.replaceAll(" ","");

        try {
            if (str.isEmpty() || str.length() == 1) return Integer.valueOf(str);
        }catch (Exception e){
            return 0;
        }

        boolean flag = true;

        if (str.charAt(0) == '-') flag = false;

        str = str.substring(1,str.length()-1);
        return 0;
    }

    public String rev(String string){
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

        return s.substring(begin+1,end);
    }

}
