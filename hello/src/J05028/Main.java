/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05028;

import java.util.*;
/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> ds = new ArrayList<>();
        while(t-->0){
            DoanhNghiep a = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            ds.add(a);
        }
        Collections.sort(ds);
        for(DoanhNghiep i : ds){
            System.out.println(i);
        }
    }
}
