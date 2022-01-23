/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05013;

/**
 *
 * @author HP
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = Integer.parseInt(sc.nextLine());
        List<TuyenDung> ds = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            TuyenDung a = new TuyenDung(i, sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            ds.add(a);
        }
        Collections.sort(ds);
        for(TuyenDung i: ds){
            System.out.println(i);
        }
    }
}
