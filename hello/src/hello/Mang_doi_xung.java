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

public class Mang_doi_xung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            boolean check = true;
            for(int i =0 ; i< n/2; i++){
                if(a[i] != a[n-i-1]) {
                    check = false;
                    break;
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
