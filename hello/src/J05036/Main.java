/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05036;

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
        for(int i = 1; i <= t; i++){
            Goods a = new Goods(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            ds.add(a);
        }
        Collections.sort(ds);
        for(Goods i : ds){
            System.out.println(i);
        }
    }
}
