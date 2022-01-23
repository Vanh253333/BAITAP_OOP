/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSachDoanhNghiep;

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
    
    static ArrayList<SinhVien> ds1 = new ArrayList<>();
    static ArrayList<DoanhNghiep> ds2 = new ArrayList<>();
    static ArrayList<ThucTap> ds3 = new ArrayList<>();
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.txt"));
        Scanner sc2 = new Scanner(new File("DN.txt"));
        Scanner sc3 = new Scanner(new File("THUCTAP.txt"));
        
        int t = Integer.parseInt(sc1.nextLine());       
        while(t-- > 0){
            SinhVien a = new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            ds1.add(a);
        }
        
        int n = Integer.parseInt(sc2.nextLine());       
        while(n-- > 0){
            DoanhNghiep a = new DoanhNghiep(sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine()));
            ds2.add(a);
        }
        
        
        int m = Integer.parseInt(sc3.nextLine());   
        while(m-- > 0){
            String s[] = sc3.nextLine().split(" ");
            ThucTap a = new ThucTap(timSV(s[0]), timDN(s[1]));
            ds3.add(a);
        }
        Collections.sort(ds3);
        
        int q = Integer.parseInt(sc3.nextLine());
        while(q-- > 0){
            String s = sc3.nextLine();            
            for(DoanhNghiep i: ds2){
                if(i.getMaDN().equals(s)){
                    System.out.println("DANH SACH THUC TAP TAI " + i.getTenDN() + ":");
                    int k = 0;
                    for(ThucTap j: ds3){
                        if(j.getDN().equals(s) && k < i.getSoSV()){
                            System.out.println(j);
                            k++;
                        }                           
                    }
                }
            }
        }
        
    }
    
    public static SinhVien timSV(String s){
        for(SinhVien i: ds1){
            if(i.getMaSV().equals(s))
                return i;
        }
        return null;
    }
    
    public static DoanhNghiep timDN(String s){
        for(DoanhNghiep i: ds2){
            if(i.getMaDN().equals(s));
            return i;
        }
        return null;
    }
}
