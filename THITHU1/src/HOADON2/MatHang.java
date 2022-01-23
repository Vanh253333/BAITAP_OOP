/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HOADON2;

/**
 *
 * @author HP
 */
public class MatHang {
    private String maMH, tenMH, dv;
    private int giaMua, giaBan;

    public MatHang(int args, String tenMH, String dv, int giaMua, int giaBan) {
        this.maMH = "MH" + String.format("%03d", args);
        this.tenMH = tenMH;
        this.dv = dv;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    public int getGiaBan(){
        return giaBan;
    }
    
    public String getMaMH(){
        return maMH;
    }

    @Override
    public String toString() {
        return tenMH + " " + dv + " " + giaMua + " " + giaBan;
    }
    
    
}
