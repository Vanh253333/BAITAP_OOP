package hello;

import java.util.*;
public class Tinh_so_fibonacci {
    public static long fibo(int n){
        long[] fibo = new long[95];
        fibo[1] = 1;
        fibo[2] = 1;
        for(int i = 3; i <= n; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo[n];
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0){
            int n = scan.nextInt();
            System.out.println(fibo(n));
        }
    }
}
