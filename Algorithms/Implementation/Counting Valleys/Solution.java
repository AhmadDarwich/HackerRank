import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); input.nextLine();
        String steps = input.nextLine();
        
        int origine = 0; 
        int nbValleys = 0; 
        Boolean downHill = false;
        
        for (int i = 0 ; i < n ; ++i){
            if (steps.charAt(i) == 'U'){
                ++origine;  
            }else {
                --origine;
            }
            if (downHill == false && origine < 0){
                ++nbValleys;
                downHill = true;
            } 
            if (origine >= 0) downHill = false;
        }
        System.out.println(nbValleys);
        
    }
}
