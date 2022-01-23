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

public class QuayPhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for(int i = 0; i < n; i++){
                a.add(sc.nextInt());
            }
            int m = (int)Collections.min(a);
            int count = 0;
            for(int i = 0; i < n; i++){
                if(a.get(i) != m)
                    count++;
                else
                    break;
            }
            System.out.println(count);
        
        }
    }
}
