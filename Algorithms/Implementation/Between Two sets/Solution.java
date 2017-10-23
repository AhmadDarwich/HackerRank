import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        int max = a[0];
        int min  = b[0];
        int  n = a.length;
        int m  = b.length;
        for(int a_i = 0; a_i < n; a_i++){
            max = a[a_i] > max ? a[a_i] :max;
        }
        for(int b_i = 0; b_i < m; b_i++){
            min = b[b_i] < min ? b[b_i] :min;
        }
        int result = 0;
        for (int i = max ; i <= min ; i+=max ){
             Boolean setA = true;
             Boolean setB = true;
            for(int a_i = 0; a_i < n; a_i++){
                
                    if (i%a[a_i] == 0) continue;
                    else{
                        setA= false;
                        break;
                    } 
                }
            for(int b_i = 0; b_i < m; b_i++){
                    if (b[b_i]%i == 0)continue;
                    else{
                      setB = false;  
                      break;  
                    } 
                }
            if(setA == true && setB == true){
               ++result; 
            }
                     
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
