/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhGioChuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static ArrayList<MonHoc> dsMH = new ArrayList<>();
    public static ArrayList<GiangVien> dsGV = new ArrayList<>();
    public static ArrayList<GioChuan> dsGC = new ArrayList<>();
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc1.nextLine());
        while(t-- > 0){
            String s[] = sc1.nextLine().split(" ");
            String tenMon = s[1];
            for(int i = 2; i < s.length; i++){
                tenMon += " " + s[i];
            }
            
            dsMH.add(new MonHoc(s[0], tenMon));
        }
        
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        int n = Integer.parseInt(sc2.nextLine());
        while(n-- > 0){
            String s[] = sc2.nextLine().split(" ");
            String tenGV = s[1];
            for(int i = 2; i < s.length; i++){
                tenGV += " " + s[i];
            }
            
            dsGV.add(new GiangVien(s[0], tenGV));
        }
        
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        int m = Integer.parseInt(sc3.nextLine());
        while(m-- > 0){
            String s[] = sc3.nextLine().split(" ");
            dsGC.add(new GioChuan(timGV(s[0]), timMH(s[1]), Double.parseDouble(s[2])));
        }
        
        for(GiangVien a: dsGV){
            for(GioChuan b: dsGC){
                if(a.getMaGV().equals(b.getMaGV()))
                    a.update(b.getGio());
            }
            System.out.println(a);
        }
    }
    
    public static MonHoc timMH(String s){
        for(MonHoc a: dsMH){
            if(a.getMaMh().equals(s))
                return a;
        }
        return null;
    }
    
    public static GiangVien timGV(String s){
        for(GiangVien a: dsGV){
            if(a.getMaGV().equals(s))
                return a;
        }
        return null;
    }
}
