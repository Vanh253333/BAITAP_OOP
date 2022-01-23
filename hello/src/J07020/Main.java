/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07020;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    static ArrayList<KhachHang> dsKH = new ArrayList<>();
    static ArrayList<MatHang> dsMH = new ArrayList<>();
    static ArrayList<HoaDon> dsHD = new ArrayList<>();
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc1 = new Scanner(new File("KH.in"));
        Scanner sc2 = new Scanner(new File("MH.in"));
        Scanner sc3 = new Scanner(new File("HD.in"));
        
        int t = Integer.parseInt(sc1.nextLine());
        for(int i = 1; i <= t; i++){
            KhachHang a = new KhachHang(i, sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            dsKH.add(a);
        }
        
        int n = Integer.parseInt(sc2.nextLine());
        for(int i = 1; i <= n; i++){
            MatHang a = new MatHang(i, sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine()));
            dsMH.add(a);
        }
        
        int m = Integer.parseInt(sc3.nextLine());
        for(int i = 1; i <= m; i++){
            String maKH = sc3.next(), maMH = sc3.next();
            HoaDon a = new HoaDon(i, timKH(maKH), timMH(maMH), Integer.parseInt(sc3.next()));
            sc3.nextLine();
            dsHD.add(a);
        }
        
        for(HoaDon x: dsHD){
            System.out.println(x);
        }
    }
    
    public static KhachHang timKH(String s){
        for(KhachHang i : dsKH){
            if(i.getMaKH().equals(s))
                return i;
        }
        return null;
    }
    
    public static MatHang timMH(String s){
        for(MatHang i : dsMH){
            if(i.getMaMH().equals(s))
                return i;
        }
        return null;
    }
}
