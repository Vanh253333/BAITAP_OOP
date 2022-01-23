/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07020;

/**
 *
 * @author HP
 */
public class MatHang {
    private String maMH, tenMH, dv;
    private int giaMua, giaBan;

    public MatHang(int id, String tenMH, String dv, int giaMua, int giaBan) {
        this.maMH = "MH" + String.format("%03d", id);
        this.tenMH = tenMH;
        this.dv = dv;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    public String getMaMH(){
        return maMH;
    }
    
    public String getTenMH(){
        return tenMH;
    }
    
    public String getDV(){
        return dv;
    }
    
    public int getGM(){
        return giaMua;
    }
    
    public int getGB(){
        return giaBan;
    }
}
