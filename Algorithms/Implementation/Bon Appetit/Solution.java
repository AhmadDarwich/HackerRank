import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int bonAppetit(int n, int k, int b, int[] ar) {
        int total = 0;
        for(int ar_i = 0; ar_i < n; ar_i++){
            total += ar[ar_i];
        }
        total = total - ar[k];
        if (total/2 - b == 0 ) {
            return 0;
        } 
        else return b - total/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if (result == 0 ) System.out.println("Bon Appetit");
        else System.out.println(result);
    }
}
