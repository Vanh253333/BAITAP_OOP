/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05048;

/**
 *
 * @author HP
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Goods> ds = new ArrayList<>();
        while(t-->0){
            Goods a = new Goods(sc.nextLine(), Integer.parseInt(sc.nextLine()));
            ds.add(a);
        }
        Collections.sort(ds);
        String x = sc.nextLine();
        for(Goods i: ds){
            if(x.equals(i.getMa()))
                System.out.println(i);
        }
    }
}
