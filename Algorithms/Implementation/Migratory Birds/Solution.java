import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
       int result  = 0 ; 
        int  [] type = new int[5];
       for(int ar_i = 0; ar_i < n; ar_i++){
            ++ type[ar[ar_i]-1] ;
        }
        int max = 0;
        for (int i = 0 ; i < 5 ; ++i){
            if (max  < type[i]) {
                result = i;
                max = type[i];
            }
        }
        return result +1 ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
