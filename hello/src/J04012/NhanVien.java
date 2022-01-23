/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04012;

/**
 *
 * @author HP
 */
public class NhanVien {
    private String maNV, hoTen, chucVu;
    private int luongCB, soCong;

    public NhanVien(String hoTen, int luongCB, int soCong, String chucVu) {
        this.maNV = "NV01";
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.luongCB = luongCB;
        this.soCong = soCong;
    }
    
    public int luong(){
        return luongCB*soCong;
    }
    
    public double thuong(){
        if(soCong >= 25)
            return luong()*0.2;
        else if(soCong < 22)
            return 0;
        else
            return luong()*0.1;
    }
    
    public int phuCap(){
        if(chucVu.equals("GD"))
            return 250000;
        else if(chucVu.equals("PGD"))
            return 200000;
        else if(chucVu.equals("TP"))
            return 180000;
        else
            return 150000;
    }
    
    public int thuNhap(){
        return luong() + (int)thuong() + phuCap();
    }

    @Override
    public String toString() {
        return maNV + " " + hoTen + " " + luong() + " " + (int)thuong() + " " + phuCap() + " " + thuNhap();
    }
    
}
