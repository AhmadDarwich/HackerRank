import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger result = new BigInteger("1");
        for (int i = 1 ; i <= n ; ++i){
            BigInteger inc = new BigInteger(String.valueOf(i));
            result = result.multiply(inc);
        }
        System.out.println(result);
    }
}
