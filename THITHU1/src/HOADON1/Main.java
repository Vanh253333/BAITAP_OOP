/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HOADON1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static ArrayList<SanPham> dsSP = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        int t = Integer.parseInt(sc1.nextLine());
        while(t-->0){
            dsSP.add(new SanPham(sc1.nextLine(), sc1.nextLine(), Integer.parseInt(sc1.nextLine()), Integer.parseInt(sc1.nextLine())));
        }
        
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        ArrayList<HoaDon> dsHD = new ArrayList<>();
        int n = Integer.parseInt(sc2.nextLine());
        for(int i = 1; i <= n; i++){
            String s[] = sc2.nextLine().split(" ");
            dsHD.add(new HoaDon(i, timSP(s[0]), s[0], Integer.parseInt(s[1])));
        }
        
        for(HoaDon a: dsHD){
            System.out.println(a);
        }
        
    }
    
    public static SanPham timSP(String s){
        for(SanPham a: dsSP){
            if(a.getMa().equals(s.substring(0, 2)))
                return a;           
        }
        return null;
    }
}
