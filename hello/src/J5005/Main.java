/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J5005;

/**
 *
 * @author HP
 */
import java.text.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> danhSach = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            SinhVien a = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
            danhSach.add(a);
        }
        Collections.sort(danhSach);
        for(SinhVien i: danhSach){
            System.out.println(i);
        }
    }
}
