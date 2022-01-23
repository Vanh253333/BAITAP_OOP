/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05038;

import java.util.*;
/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> ds = new ArrayList<>();
//        long tong = 0;
        for(int i = 1; i <= t; i++){
            NhanVien a = new NhanVien(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
            ds.add(a);
//            tong += a.getThucLinh();
        }
        
        Collections.sort(ds);
//        System.out.println("Tong chi phi tien luong: " + tong);
        for(NhanVien a : ds){
            System.out.println(a);
        }
    }
}
