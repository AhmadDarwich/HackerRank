import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int max = h[0]; 
        for (int i = 0 ; i < word.length() ; ++i){
            int alphabeticNumber = (int)word.charAt(i) - 96 -1 ;
            if(h[alphabeticNumber] > max){
                max = h[alphabeticNumber];
            }
        }
        System.out.println(word.length() * 1 * max );
    }
}
