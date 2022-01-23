/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HOADON2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static ArrayList<KhachHang> dsKH = new ArrayList<>();
    public static ArrayList<MatHang> dsMH = new ArrayList<>();
    public static ArrayList<HoaDon> dsHD = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc1 = new Scanner(new File("KH.in"));
        int t = Integer.parseInt(sc1.nextLine());
        for(int i = 1; i <= t; i++){
            dsKH.add(new KhachHang(i, sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        
        Scanner sc2 = new Scanner(new File("MH.in"));
        int n = Integer.parseInt(sc2.nextLine());
        for(int i = 1; i <= n; i++){
            dsMH.add(new MatHang(i, sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine())));
        }
        
        Scanner sc3 = new Scanner(new File("HD.in"));
        int m = Integer.parseInt(sc3.nextLine());
        for(int i = 1; i <= m; i++){
            String s[] = sc3.nextLine().split(" ");
            dsHD.add(new HoaDon(i, timKH(s[0]), timMH(s[1]), Integer.parseInt(s[2])));
        }
        
        for(HoaDon a: dsHD){
            System.out.println(a);
        }
    }
    
    public static KhachHang timKH(String s){
        for(KhachHang a: dsKH){
            if(a.getMaKH().equals(s))
                return a;
        }
        return null;
    }
    
    public static MatHang timMH(String s){
        for(MatHang a: dsMH){
            if(a.getMaMH().equals(s))
                return a;
        }
        return null;
    }
}
