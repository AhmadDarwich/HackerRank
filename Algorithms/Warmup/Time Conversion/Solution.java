import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        String time= "";
        int hours = Integer.parseInt (s.substring(0,2));
        int minutes = Integer.parseInt (s.substring(3,5));
        int secondes = Integer.parseInt (s.substring(6,8));
        String AM_PM = s.substring(8,10);
        if (AM_PM.equals("PM")){
            if (hours !=12)
               hours +=12;
            else hours = 12;
            time = String.format("%02d",hours)+":"+String.format("%02d",minutes)+":"+String.format("%02d",secondes);  
        }else{
            if (hours==12) hours = 0;
            time = String.format("%02d",hours)+":"+String.format("%02d",minutes)+":"+String.format("%02d",secondes);
        }
        return time ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
