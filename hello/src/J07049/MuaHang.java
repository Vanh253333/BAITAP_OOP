/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07049;

/**
 *
 * @author HP
 */
public class MuaHang {
    private String maSP, tenSP;
    private int gia, thoiHan;
    public MuaHang(String maSP, String tenSP, int gia, int thoiHan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.thoiHan = thoiHan;
    }
    
    public String getmaSP(){
        return maSP;
    }
    
    public int getGia(){
        return gia;
    }
    
    public int getThoiHan(){
        return thoiHan;
    }
    
    
}
