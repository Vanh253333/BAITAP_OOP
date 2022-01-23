/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04015;

/**
 *
 * @author HP
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> ds = new ArrayList<>();
        int ht = 0, hp = 0;
        while(t-- > 0){
            GiaoVien a = new GiaoVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            if(a.getChucVu().equals("HT") && ht >= 1) continue;
            else if(a.getChucVu().equals("HP") && hp >= 2) continue;
            else ds.add(a);
            if(a.getChucVu().equals("HP")) hp += 1;
            if(a.getChucVu().equals("HT")) ht += 1; 
        }
        
        for(GiaoVien a: ds){
            System.out.println(a);
        }
    }
}
