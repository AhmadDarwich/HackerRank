import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        
        int max = -1;
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int n = keyboards.length;
        int m = drives.length;
        
        for(int keyboards_i=n-1; keyboards_i >=0; --keyboards_i){
            for(int drives_i=m-1; drives_i >=0 ; --drives_i){
                 int somme = keyboards[keyboards_i] + drives[drives_i];
                 if (max < somme && s >= somme){
                     max = somme;
                 }      
             }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
