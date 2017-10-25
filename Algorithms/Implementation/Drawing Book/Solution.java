import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        int frontPage = (p/2);
        int backPage = 0;
        if(n%2==1)
            backPage = (n-p)/2;
        else
            backPage = (int) Math.ceil((n-p)/2.0);
       if (frontPage > backPage){
           return backPage;
       }else return frontPage;
     
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
