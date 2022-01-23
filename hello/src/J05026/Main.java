/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05026;

import java.util.*;
/**
 *
 * @author HP
 */
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> ds = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            GiangVien a = new GiangVien(i, sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String boMon = sc.nextLine();
            boMon = chuanHoa(boMon);
            System.out.println("DANH SACH GIANG VIEN BO MON " + boMon + ":");
            for(GiangVien i: ds){
                if(boMon.equals(i.bm()))
                    System.out.println(i);
            }
        }
    }
     
     static String chuanHoa(String s){
        StringBuilder res = new StringBuilder();
        String[] ds = s.split(" ");
        for(int i = 0; i < ds.length; i++){
            res.append(Character.toUpperCase(ds[i].charAt(0)));
        }
        return res.toString();
     }
}
