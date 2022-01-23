/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07027;

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
    static ArrayList<SinhVien> dsSV = new ArrayList<>();
    static ArrayList<BaiTap> dsBT = new ArrayList<>();
    static ArrayList<Nhom> dsN = new ArrayList<>();
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("BAITAP.in"));
        Scanner sc3 = new Scanner(new File("NHOM.in"));
        
        int n = Integer.parseInt(sc1.nextLine());
        for(int i = 0; i < n; i++){
            SinhVien a = new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            dsSV.add(a);
        }
        
        int m = Integer.parseInt(sc2.nextLine());
        for(int i = 1; i <= m; i++){
            BaiTap a = new BaiTap(i, sc2.nextLine());
            dsBT.add(a);
        }
        
        while(sc3.hasNextLine()){
            String s[] = sc3.nextLine().split("\\s+");
            Nhom a = new Nhom(timSV(s[0]), timBT(Integer.parseInt(s[1])));
            dsN.add(a);
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
    
    public static BaiTap timBT(int n){
        for(BaiTap a: dsBT){
            if(a.getMaBT() == n)
                return a;
        }
        return null;
    }
}
