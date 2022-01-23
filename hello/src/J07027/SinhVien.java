/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07027;

/**
 *
 * @author HP
 */
public class SinhVien {
    private String maSV, ten, sdt;

    public SinhVien(String maSV, String ten, String sdt) {
        this.maSV = maSV;
        this.ten = ten;
        this.sdt = sdt;
    }
    
    public String getMaSV(){
        return maSV;
    }
    
    public String getTenSV(){
        return ten;
    }
    
    public String getSDT(){
        return sdt;
    }
}
