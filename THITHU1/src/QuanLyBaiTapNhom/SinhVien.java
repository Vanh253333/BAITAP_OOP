/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBaiTapNhom;

/**
 *
 * @author HP
 */
public class SinhVien {
    private String maSV, tenSV, sdt;

    public SinhVien(String maSV, String tenSV, String sdt) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + sdt;
    }
    
    public String getMaSV(){
        return maSV;
    }
}
