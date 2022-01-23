/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05024;

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
        while(t-->0){
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String nganh = sc.nextLine();

            System.out.println("DANH SACH SINH VIEN NGANH " + nganh.toUpperCase() + ":");
            for (SinhVien i : ds){
                if(nganh.equals(i.getNganh()))
                    System.out.println(i);
            }
        }
    }
}
