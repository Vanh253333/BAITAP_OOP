/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBaiTapNhom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static ArrayList<SinhVien> dsSV = new ArrayList<>();
    public static ArrayList<BaiTap> dsBT = new ArrayList<>();
    public static ArrayList<Nhom> dsN = new ArrayList<>();
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc1.nextLine());
        for(int i = 1; i <= t; i++){
            dsSV.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        
        Scanner sc2 = new Scanner(new File("BAITAP.in"));
        int n = Integer.parseInt(sc2.nextLine());
        for(int i = 1; i <= n; i++){
            dsBT.add(new BaiTap(""+i, sc2.nextLine()));
        }
        
        Scanner sc3 = new Scanner(new File("NHOM.in"));
        for(int i = 1; i <= t; i++){
            String s[] = sc3.nextLine().split(" ");
            dsN.add(new Nhom(timSV(s[0]), timBT(s[1])));
        }
        Collections.sort(dsN);
        for(Nhom a: dsN){
            System.out.println(a);
        }
    }
    
    public static SinhVien timSV(String s){
        for(SinhVien a: dsSV){
            if(a.getMaSV().equals(s))
                return a;
        }
        return null;
    }
    
    public static BaiTap timBT(String s){
        for(BaiTap a: dsBT){
            if(a.getMaBT().equals(s))
                return a;
        }
        return null;
    }
}
