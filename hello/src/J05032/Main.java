/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05032;

import java.util.*;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int tmp = t;
        ArrayList<People> ds = new ArrayList<>();
        while(t-- > 0){
            People x = new People(sc.next(), sc.next());
            ds.add(x);
        }
        Collections.sort(ds);
        System.out.println(ds.get(0));
        System.out.println(ds.get(tmp-1));
    }
}
