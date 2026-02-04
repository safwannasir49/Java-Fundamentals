import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int i;
        for(i=1;i<=10;i++){
            System.out.print(n+" x "+i+" = "+i*n);
            System.out.println();
        }
        bufferedReader.close();
    }
}
