import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        HashMap<Integer,Integer> numbers = new HashMap<Integer,Integer>();
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            if (numbers.containsKey(a[a_i])){
                numbers.put(a[a_i],numbers.get(a[a_i])+1);
            }else {
                numbers.put(a[a_i],1);
            }
       }                            
       int maxSet = 0;
       for(int i : numbers.keySet())
       {
            int compare = (numbers.containsKey(i+1)) ? numbers.get(i) + numbers.get(i+1) : numbers.get(i);
            if(compare > maxSet)
                maxSet = compare;
       }        
       System.out.println(maxSet);
    }
}
