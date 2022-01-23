/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06001;

/**
 *
 * @author HP
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> dsSP = new ArrayList<>();
        ArrayList<HoaDon> dsHD = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            SanPham a = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            dsSP.add(a);
        }
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            HoaDon a = new HoaDon(i, sc.next(), sc.nextInt());
            dsHD.add(a);
            sc.nextLine();
            for(SanPham x: dsSP){
                if(x.getMa().equals(a.getMa())){
                   a.setTen(x.getTen());
                   if(a.getMaGia() == '2')
                       a.setThanhTien(x.getGia2());
                   else
                       a.setThanhTien(x.getGia1());
                }

            }
        }
        Collections.sort(dsHD);
        for(HoaDon x: dsHD){
            System.out.println(x);
        }
        
        
    }
    
}
