/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author HP
 */
import java.util.*;

public class so_nguyen_to {
    static boolean SNT(long n) {
        if(n < 2)   return false;
        for(long i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0)  return false;
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        while(t-- >0){
            long n = scan.nextInt();
            if(SNT(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
