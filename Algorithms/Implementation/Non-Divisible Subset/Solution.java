import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] subSet = new int[k];
        int resultat = 0;
        for(int i=0; i < n; i++){
            int reste = in.nextInt();
            ++subSet[reste%k];
        }  
        for (int i = 0; i <= k/2  ; ++i){
            int secondNumber = (k - i) % k;
            if (i == secondNumber) {
                resultat += Math.min(subSet[i],1);
            }else {
                resultat += Math.max(subSet[i],subSet[secondNumber]);
            } 
        }
        System.out.println(resultat);
        in.close();     }
}
