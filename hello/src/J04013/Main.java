/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04013;

/**
 *
 * @author HP
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<TuyenSinh> ds = new ArrayList<>();
        while(t-- > 0){
            TuyenSinh a = new TuyenSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            ds.add(a);
        }
        Collections.sort(ds);
        
        int chiTieu = Integer.parseInt(sc.nextLine());
        double diemChuan = ds.get(chiTieu-1).tongDiem();
        System.out.println(String.format("%.1f", diemChuan));
        for(TuyenSinh a: ds){
            if(a.tongDiem() >= diemChuan){
                a.settrangThai("TRUNG TUYEN");
            }else{
                a.settrangThai("TRUOT");
            }
            System.out.println(a);
        }
    }
    
}
