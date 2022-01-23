/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.*;

public class Phan_tich_thua_so_NT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 1;
        while(t-- > 0){
            System.out.print("Test " + cnt + ": ");
            long n = sc.nextLong();
            for(int i = 2; i <= Math.sqrt(n); i++){
                int dem = 0;
                 while (n%i==0){
                    dem++;
                    n/=i;
                }
                if (dem != 0){
                    System.out.print(i+"("+ dem +") ");
                }
            }
            if (n!=1)
                System.out.println(n+"(1)");
            else
                System.out.println();
            cnt++;
        }
    }

}




