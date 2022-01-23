/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05023;

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
            String khoa = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + khoa + ":");
            for (SinhVien i : ds){
                if(khoa.equals(i.getKhoa()))
                    System.out.println(i);
            }
        }
    }
}
