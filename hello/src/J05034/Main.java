/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05034;

import java.util.*;
/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThucTap> ds = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ThucTap x = new ThucTap(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(x);
        }
        Collections.sort(ds);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String dn = sc.nextLine();
            for(ThucTap i: ds){
                if(i.getDN().equals(dn))
                    System.out.println(i);
            }
        }
    }
}
