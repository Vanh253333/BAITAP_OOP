/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05007;

import java.util.*;
import java.text.*;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> ds = new ArrayList<>();
        for(int i = 1; i <=n; i++){
            NhanVien a = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        Collections.sort(ds);
        for(NhanVien i : ds)
            System.out.println(i);
                    
    }
}
