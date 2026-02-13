//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int max = Math.max(a,Math.max(b,c));
        System.out.println(max);
    }
}
