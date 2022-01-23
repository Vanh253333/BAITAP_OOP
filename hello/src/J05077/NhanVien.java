/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05077;

/**
 *
 * @author HP
 */
public class NhanVien {
    private String ma, ten;
    private long luongCB;
    private int soNgay;
    private PhongBan x;
    public NhanVien(String ma, String ten, long luongCB, int soNgay, PhongBan x) {
	this.ma=ma;
	this.ten=ten;
	this.luongCB=luongCB;
	this.soNgay=soNgay;
	this.x=x;
    }
    private int heSoLuong() {
	char a = ma.charAt(0);
	int soNam = Integer.parseInt(String.valueOf(ma.toCharArray(), 1, 2));
	if(a=='A') {
            if(1<=soNam && soNam <=3)
                return 10;
            if(4<=soNam && soNam <=8)
                return 12;
            if(9<=soNam && soNam <=15)
                return 14;
            return 20;
	}else if(a=='B') {
            if(1<=soNam && soNam <=3)
		return 10;
            if(4<=soNam && soNam <=8)
		return 11;
            if(9<=soNam && soNam <=15)
		return 13;
            return 16;
	}
	else if(a=='C') {
            if(1<=soNam && soNam <=3)
		return 9;
            if(4<=soNam && soNam <=8)
		return 10;
            if(9<=soNam && soNam <=15)
		return 12;
            return 14;
	}else {
            if(1<=soNam && soNam <=3)
		return 8;
            if(4<=soNam && soNam <=8)
		return 9;
            if(9<=soNam && soNam <=15)
		return 11;
            return 13;
	}
    }

    private long luongThang() {
	return (long) luongCB*1000*soNgay*heSoLuong();

    }

    public String maPhongBan() {
	return x.getMaPhong();
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + luongThang();
    }
    
}
