/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06003;

/**
 *
 * @author HP
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> dssv = new ArrayList<>();
        ArrayList<BaiTap> dsbt = new ArrayList<>();
        
        while(n-- > 0){
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            dssv.add(a);
        }
        
        while(m-- > 0){
            BaiTap a = new BaiTap(sc.nextLine());
            dsbt.add(a);
        }
        
//        int q = Integer.parseInt(sc.nextLine());
//        while(q-- > 0){
//            int k = Integer.parseInt(sc.nextLine());
//            System.out.println("DANH SACH NHOM " + k + ":");
//            for(SinhVien a: dssv){
//                if(a.getSTT() == k)
//                    System.out.println(a);
//            }
//            System.out.print("Bai tap dang ky: ");
//            System.out.println(dsbt.get(k-1));
//        }

         Collections.sort(dssv);
         for(SinhVien a: dssv){
             System.out.println(a + " " + dsbt.get(a.getSTT()-1));
         }
    }
}
