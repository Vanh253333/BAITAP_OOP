/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05065;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s[] = sc.nextLine().split(" ");
            String ten = s[1];
            for(int i = 2; i < s.length; i++){
                ten += " " + s[i];
            }
            String ma = s[0].substring(0, 2);
            int soHieu = Integer.parseInt(s[0].substring(4));
            if(ma.equals("GD")){
                if(soHieu > 1)
                     s[0] = change(s[0]);
            }
            if(ma.equals("TP") || ma.equals("PP")){
                if(soHieu > 3)
                    s[0] = change(s[0]);
            }
 
            ds.add(new NhanVien(s[0], ten));
        }
        Collections.sort(ds);

        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String ten = sc.nextLine().toLowerCase();
            for(NhanVien a: ds){
                if(a.getTen().contains(ten))
                    System.out.println(a);
            }
            System.out.println();
        }
    }
    
    public static String change(String s){
        return "NV" + s.substring(2);
    }
}
