/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05076;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> dsMH = new ArrayList<>();
        ArrayList<ThongKe> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            MatHang a = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLine());
            dsMH.add(a);
        }
        
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String[] s = sc.nextLine().split(" ");
            for(MatHang a : dsMH) {
		if(a.getMa().equals(s[0])) {
                    ds.add(new ThongKe(a, Integer.parseInt(s[1]), Long.parseLong(s[2]), Integer.parseInt(s[3])));
                }
            }
        }
        for(ThongKe a: ds){
            System.out.println(a);
        }
    }

}
