import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        int jours = 256;
        String date = "";
        if (year < 1918){
            if (year% 4 ==0) jours = jours - 244;
            else jours = jours  - 243;
        }else if (year == 1918) {
            jours = 26;
        }
        else {
           if (year % 400 ==0 || (year % 4 ==0 && year % 100 !=0 ) ) jours = jours - 244;
            else jours = jours  - 243; 
        }
        date+= jours + ".09." + year;
       return date; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
