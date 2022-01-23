/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05074;

/**
 *
 * @author HP
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int tmp = t;
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        ArrayList<ChuyenCan> ds = new ArrayList<>();
        while(t-- > 0){
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            dsSV.add(a);
        }
        
        while(tmp-- > 0){
            String maSV = sc.next();
            String dl = sc.next();
            for(SinhVien x : dsSV){
                 if(x.getMa().equals(maSV)){
                    ChuyenCan a = new ChuyenCan(maSV, dl, x);
                    ds.add(a);
                    break;
                }
            }
        }
        sc.nextLine();
        String lop = sc.nextLine();
        for(SinhVien i: dsSV){
            for(ChuyenCan j: ds){
                    if(i.getMa().equals(j.getMa()) && i.getLop().equals(lop)){
                        System.out.println(j);
                    }  
            }
        }
        
    }
    
}
