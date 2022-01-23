/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th1;

/**
 *
 * @author HP
 */
import java.util.*;

public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(check(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    
    static boolean check(long n){
        int tmp = (int)Math.sqrt(n);
        if (tmp*tmp == n)
            return true;
        else
            return false;
    }
}
