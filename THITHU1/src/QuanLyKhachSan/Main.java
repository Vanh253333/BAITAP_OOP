/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyKhachSan;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static ArrayList<Phong> dsP = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            dsP.add(new Phong(sc.nextLine().split(" ")));
        }
        
        ArrayList<KhachHang> dsKH = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String tenKH = sc.nextLine();
            String maP = sc.nextLine();
            String den = sc.nextLine(), di = sc.nextLine();
            dsKH.add(new KhachHang(i, tenKH, maP, den, di, timP(""+maP.charAt(2))));
        }
        
        Collections.sort(dsKH);
        for(KhachHang a: dsKH){
            System.out.println(a);
        }
    }
    
    public static Phong timP(String s){
        for(Phong a: dsP){
            if(a.getLoai().equals(s))
                return a;
        }
        return null;
    }
}
