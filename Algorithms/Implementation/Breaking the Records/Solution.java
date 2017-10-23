import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        int n = s.length;
        int[] results = {0 , 0};
        int tmpHigh = s[0];
        int tmpLow = s[0];
        for(int s_i=0; s_i < n; s_i++){
            if (tmpLow >s[s_i]){
                ++results[1];
                tmpLow = s[s_i];
            }
            if (tmpHigh <s[s_i]){
                ++results[0];
                tmpHigh = s[s_i];
            }    
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
