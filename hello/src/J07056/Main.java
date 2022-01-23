/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07056;

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
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<KhachHang> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            String ten = sc.nextLine();
            String s[] = sc.nextLine().split(" ");
            KhachHang a = new KhachHang(i, ten, s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]));
            ds.add(a);
        }
        Collections.sort(ds);
        for(KhachHang a: ds){
            System.out.println(a);
        }
    }
}
