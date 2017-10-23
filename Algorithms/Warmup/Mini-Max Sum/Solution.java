import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        long somme = 0L;
        long max = 0;
        long min = Long.MAX_VALUE;
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            somme += arr[arr_i];
            if (max < arr[arr_i])max = arr[arr_i];
            if (min  > arr[arr_i])min = arr[arr_i];
        }
        
        long minimum = somme - max;
        long maximum = somme - min;
        
        System.out.println(minimum+" "+maximum);
    }
}
