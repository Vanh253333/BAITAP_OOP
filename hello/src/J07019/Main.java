/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07019;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    static ArrayList<SanPham> dsSP = new ArrayList<>();
    static ArrayList<HoaDon> dsHD = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        int t = Integer.parseInt(sc1.nextLine());
        for(int i = 1; i <= t; i++){
            SanPham a = new SanPham(sc1.nextLine(), sc1.nextLine(), Integer.parseInt(sc1.nextLine()), Integer.parseInt(sc1.nextLine()));
            dsSP.add(a);
        }
        
       int n = Integer.parseInt(sc2.nextLine());
        for(int i = 1; i <= n; i++){
            String maHD = sc2.next();
            HoaDon a = new HoaDon(i, timSP(maHD), maHD, Integer.parseInt(sc2.next()));
            sc2.nextLine();
            dsHD.add(a);
        }
        
        for(HoaDon i: dsHD){
            System.out.println(i);
        }
    }
    
    static public SanPham timSP(String s){
        for(SanPham i: dsSP){
            if(i.getMa().equals(s.substring(0, 2)))
                return i;
        }
        return null;
    }
}
