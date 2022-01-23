/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05077;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t =Integer.parseInt(sc.nextLine());
	ArrayList<PhongBan> ds1 = new ArrayList<>();
	while(t-- > 0) {
            String[] s = (sc.nextLine()).split(" ");
            String ten = s[1];
            for(int i = 2; i < s.length; i++) {
		ten += " " + s[i];
            }		
            ds1.add(new PhongBan(s[0], ten));
        }
		
        int q = Integer.parseInt(sc.nextLine());
	ArrayList<NhanVien> ds2 = new ArrayList<>();
	while(q-->0) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long luongCB = Long.parseLong(sc.nextLine());
            int soNgay = Integer.parseInt(sc.nextLine());
            for(PhongBan a : ds1) {
		if(a.getMaPhong().equals(String.valueOf(ma.toCharArray(), 3, 2))) {
                    ds2.add(new NhanVien(ma, ten, luongCB, soNgay, a));
		}
            }
	}
        String mp = sc.nextLine();
	for(PhongBan a : ds1) {
            if(a.getMaPhong().equals(mp)) {
		System.out.println("Bang luong phong " + a.getTenPhong() + ":");
                break;
            }
	}
        for(NhanVien a : ds2) {
            if(a.maPhongBan().equals(mp)){
                System.out.println(a);
            }
	}
    }
}
