import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String winner = "";
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            if (Math.abs(z - y) > Math.abs(z- x)) winner += "Cat A";
            else if (Math.abs(z - y) <Math.abs( z- x)) winner += "Cat B";
            else winner += "Mouse C";
            winner += "\n";
        }
        System.out.println(winner);
    }
}
