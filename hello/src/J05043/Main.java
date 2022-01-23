/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05043;

/**
 *
 * @author HP
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> ds = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            NhanVien a = new NhanVien(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            ds.add(a);
        }
        Collections.sort(ds);
//        String cv = sc.nextLine();
        for(NhanVien i : ds){
//            if(cv.equals(i.getCV())){
//                System.out.println(i);
//            }
            System.out.println(i);
        }
    }
    
}
