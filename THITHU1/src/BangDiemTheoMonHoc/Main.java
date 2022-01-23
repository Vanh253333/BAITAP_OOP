/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangDiemTheoMonHoc;

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
    public static ArrayList<MonHoc> dsMH = new ArrayList<>();
    public static ArrayList<BangDiem> dsBD = new ArrayList<>();
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc1.nextLine());
        while(t-- > 0){
            dsSV.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        
        Scanner sc2 = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc2.nextLine());
        while(n-- > 0){
            dsMH.add(new MonHoc(sc2.nextLine(), sc2.nextLine(), sc2.nextLine()));
        }
        
        Scanner sc3 = new Scanner(new File("BANGDIEM.in"));
        int m = Integer.parseInt(sc3.nextLine());
        while(m-- > 0){
            String s[] = sc3.nextLine().split(" ");
            dsBD.add(new BangDiem(timSV(s[0]), timMH(s[1]), s[2]));
        }
        Collections.sort(dsBD);
        
        int q = Integer.parseInt(sc3.nextLine());
        while(q-- > 0){
            String maLop = sc3.nextLine();
            for(SinhVien x: dsSV){
                if(x.getLop().equals(maLop)){
                    System.out.println("BANG DIEM lop " + x.getLop() + ":");
                    break;
                }
                    
            }
            for(BangDiem a: dsBD){
                if(a.getMaLop().equals(maLop)){
                    System.out.println(a);
                }                    
            }
        }
        
    }
    
    public static SinhVien timSV(String s){
        for(SinhVien a: dsSV){
            if(a.getMaSV().equals(s))
                return a;
        }
        return null;
    }
    
    public static MonHoc timMH(String s){
        for(MonHoc a: dsMH){
            if(a.getMa().equals(s))
                return a;
        }
        return null;
    }
}
