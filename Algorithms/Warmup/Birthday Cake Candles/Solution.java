import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        long max = ar[0];
        int j = 0;
        for(int ar_i = 0; ar_i < n; ar_i++){
            if (max < ar[ar_i]) {
                j = 1;
                max = ar[ar_i];
            }
            else if (max == ar[ar_i]) ++j;
        } 

        return j;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
