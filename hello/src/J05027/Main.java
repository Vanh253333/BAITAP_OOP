/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05027;

import java.util.*;
/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> ds = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            GiangVien x = new GiangVien(i, sc.nextLine(), sc.nextLine());
            ds.add(x);
        }
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String key = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + key + ":");
            for(GiangVien i: ds){
                if(i.getTen().contains(key.toLowerCase()))
                    System.out.println(i);
            }
        }
    }
}
