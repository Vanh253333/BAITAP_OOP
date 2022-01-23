/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05079;

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
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<LopHoc> ds = new ArrayList<>();
        while(t-- > 0){
            LopHoc a = new LopHoc(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        
         Collections.sort(ds);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String maLop = sc.nextLine();
            System.out.println("Danh sach cho giang vien " + maLop + ":");
            for(LopHoc a : ds){
                if(a.getTenMH().equals(maLop)){
                    System.out.println(a);
                }
            }
        }
      
        
    }
}
