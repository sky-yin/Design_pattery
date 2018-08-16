package algorithm.leetCode;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.*;

public class ZigZagConversion {

    public String convert(String s, int numRows) {

        if(numRows == 1){
            return s;
        }

        String[][] str = new String[2][s.length()];
        int n = 0;
        boolean flag = true;
        for(int i=0;i<s.length();i++){
            str[0][i] = s.substring(i,i+1);
            str[1][i] = String.valueOf(n);
            if(flag){
                n++;
            }else{
                n--;
            }
            if(n == numRows-1 || n == 0){
                flag = !(n==numRows-1);
            }
        }

        StringBuilder res = new StringBuilder("");

        for(int j=0;j<numRows;j++){
            for(int i=0;i<s.length();i++){
                if(str[1][i].equals(String.valueOf(j))){
                    res.append(str[0][i]);
                }
            }
        }

        return res.toString();
    }
}
