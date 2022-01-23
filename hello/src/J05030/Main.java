/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05030;

import java.util.*;
/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        while(t-- > 0){
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            ds.add(x);
        }
        Collections.sort(ds);
        int k = 1;
        for(SinhVien i: ds){
            System.out.println((k++) + " " + i);
        }
    }
}
