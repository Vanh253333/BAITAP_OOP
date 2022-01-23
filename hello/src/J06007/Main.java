/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06007;

/**
 *
 * @author HP
 */
import java.util.*;
public class Main {
    static ArrayList<GiangVien> dsGV = new ArrayList<>();
    static ArrayList<MonHoc> dsMH = new ArrayList<>();
    static ArrayList<LopHocPhan> dsLHP = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s[] = sc.nextLine().split(" ");
            String monHoc = s[1];
            for(int i = 2; i < s.length; i++){
                monHoc += " " + s[i];
            }
            MonHoc a = new MonHoc(s[0], monHoc);
            dsMH.add(a);
        }
        
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String s[] = sc.nextLine().split(" ");
            String ten = s[1];
            for(int i = 2; i < s.length; i++){
                ten += " " + s[i];
            }
            GiangVien a = new GiangVien(s[0], ten);
            dsGV.add(a);
                    
        }
        
        int m = Integer.parseInt(sc.nextLine());
        while(m-- >0){
            String maGV = sc.next(), maMH = sc.next();
            double gio = sc.nextDouble();
            sc.nextLine();
            LopHocPhan a = new LopHocPhan(timGV(maGV), timMH(maMH), gio);
            dsLHP.add(a);
        } 
        
        String maGV = sc.nextLine();
        for(GiangVien x: dsGV){
            if(x.getMa().equals(maGV)){
                System.out.println("Giang vien: " + x.getTen());
            }
        }
        
        double tong = 0;
        for(LopHocPhan x: dsLHP){
            if(x.getMaGV().equals(maGV)){
                tong += x.getGio();
                for(MonHoc y : dsMH){
                    if(y.getMa().equals(x.getMaMH())){
                        System.out.println(y.getTen() + " " + x.getGio());
                    }
                }
            }
        }
        System.out.println("Tong: " + String.format("%.2f", tong));
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
