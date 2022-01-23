/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07053;

import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class ThiSinh {
    private String ma, ten, ngaySinh;
    private float diemLT, diemTH;
    public ThiSinh(int i, String ten, String ngaySinh, float diemLT, float diemTH) {
	this.ma =  "PH"+String.format("%02d", i);
	this.ten = chuanHoa(ten);
	this.ngaySinh = ngaySinh;
	this.diemLT = diemLT;
	this.diemTH = diemTH;
    }
    
    private String chuanHoa(String s){
        StringBuilder res = new StringBuilder();
        StringTokenizer str = new StringTokenizer(s);
        while(str.hasMoreTokens()){
            String tmp = str.nextToken();
            res.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i< tmp.length(); i++){
                res.append(tmp.toLowerCase().charAt(i));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }

    private int tuoi() {
	String s[] = ngaySinh.split("/");
	return 2021-Integer.parseInt(s[2]);
    }
	
    private double diemThuong() {
	if(diemLT >= 8 && diemTH >= 8) return 1;
	if(diemLT >= 7.5 && diemTH >= 7.5) return 0.5;
	return 0;
    }
	
    private int diemTB() {
	double diem = (diemLT+diemTH)/2+diemThuong();
	if(diem>=10) return 10;
	return (int) Math.round(diem);
    }

    private String xepLoai() {
	if(diemTB() == 9 || diemTB() == 10) return "Xuat sac";
	if(diemTB() == 8) return "Gioi";
	if(diemTB() == 7) return "Kha";
	if(diemTB() == 5 || diemTB() == 6) return "Trung binh";
	return "Truot";
    }
	
    @Override
    public String toString() {
	return ma+" "+ten+" "+tuoi()+" "+diemTB()+" "+xepLoai();
    }
}
