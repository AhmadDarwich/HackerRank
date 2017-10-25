import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        int nbPairs = 0;
        HashMap <Integer,Integer> color = new HashMap <Integer , Integer> ();
        for(int ar_i = 0; ar_i < n; ar_i++){
            if (color.containsKey(ar[ar_i])){
                color.remove(ar[ar_i]);
                ++nbPairs;
            }else{
                color.put(ar[ar_i],1);
            }
        }
        return nbPairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
