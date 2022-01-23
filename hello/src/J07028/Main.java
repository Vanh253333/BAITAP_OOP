/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07028;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    static ArrayList<GiangVien> dsGV = new ArrayList<>();
    static ArrayList<MonHoc> dsMH = new ArrayList<>();
    static ArrayList<GioChuan> dsGC = new ArrayList<>();
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        
        int t = Integer.parseInt(sc1.nextLine());
        while(t-- > 0){
            String s[] = sc1.nextLine().split("\\s+");
            String s1 = s[1];
            for(int i = 2; i < s.length; i++){
                s1 += " " + s[i];
            }
            
            dsMH.add(new MonHoc(s[0], s1));
        }
        
        int n = Integer.parseInt(sc2.nextLine());
        while(n-- > 0){
            String s[] = sc2.nextLine().split("\\s+");
            String s1 = s[1];
            for(int i = 2; i < s.length; i++){
                s1 += " " + s[i];
            }
            
            dsGV.add(new GiangVien(s[0], s1));
        }
        
        int m = Integer.parseInt(sc3.nextLine());
        while(m-- > 0){
            dsGC.add(new GioChuan(timGV(sc3.next()), timMH(sc3.next()), Double.parseDouble(sc3.next())));
            sc3.nextLine();
        }
        
        for(GiangVien x: dsGV){
            for(GioChuan y: dsGC){
                if(x.getMa().equals(y.getMaGV()))
                    x.update(y.getGio());
            }
            System.out.println(x);
        }
    }
    
    static public GiangVien timGV(String maGV){
        for(int i = 0; i < dsGV.size(); i++){
            if(dsGV.get(i).getMa().equals(maGV)){
                return dsGV.get(i);
            }    
        }
        return null;
    }
    
    static public MonHoc timMH(String maMH){
        for(int i = 0; i < dsMH.size(); i++){
            if(dsMH.get(i).getMa().equals(maMH)){
                return  dsMH.get(i);
            }
        }
        return null;
    }
}
