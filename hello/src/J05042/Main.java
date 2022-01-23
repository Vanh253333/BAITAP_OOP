/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05042;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextLong());
            ds.add(a);
            sc.nextLine();
        }
        
        Collections.sort(ds);
        for(SinhVien a: ds){
            System.out.println(a);
        }
    }
}
