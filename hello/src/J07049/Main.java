/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07049;

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
    static public ArrayList<MuaHang> dsSP = new ArrayList<>();
    static public ArrayList<KhachHang> dsKH = new ArrayList<>();
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            dsSP.add(new MuaHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            dsKH.add(new KhachHang(i, sc.nextLine(), sc.nextLine(), timSP(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine()));           
        }
        Collections.sort(dsKH);
        for(KhachHang a: dsKH){
            System.out.println(a);
        }
    }
    
    private static MuaHang timSP(String s){
        for(MuaHang a: dsSP){
            if(a.getmaSP().equals(s))
                return a;
        }
        return null;
    }
}
