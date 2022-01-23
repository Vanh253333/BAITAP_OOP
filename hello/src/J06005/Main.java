/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06005;

/**
 *
 * @author HP
 */
import java.text.ParseException;
import java.util.*;
public class Main {
        static ArrayList<MatHang> dsMH = new ArrayList<>();
        static ArrayList<KhachHang> dsKH = new ArrayList<>();
        static ArrayList<HoaDon> dsHD = new ArrayList<>();
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            KhachHang a = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            dsKH.add(a);
        }
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            MatHang a = new MatHang(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            dsMH.add(a);
        }
        
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String maKH = sc.next(), maMH = sc.next();
            int sl = sc.nextInt();
            sc.nextLine();    
            HoaDon a = new HoaDon(i, timKH(maKH), timMH(maMH), sl);
            dsHD.add(a);
        }  
        
        Collections.sort(dsHD);
        for(HoaDon x : dsHD){
            System.out.println(x);
        }
    }
    
    
    static public KhachHang timKH(String maKH){
        KhachHang a = dsKH.get(0);
        for(int i = 0; i < dsKH.size(); i++)
            if(dsKH.get(i).getMa().equals(maKH))
                a = dsKH.get(i);  
        return a;
    }
    
    static public MatHang timMH(String maMH){
        MatHang a = dsMH.get(0);
        for(int i = 0; i < dsMH.size(); i++)
            if(dsMH.get(i).getMa().equals(maMH))
                a = dsMH.get(i);
        return a;
    }
}
