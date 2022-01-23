/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04015;

/**
 *
 * @author HP
 */
public class GiaoVien {
    private String maNgach, hoTen;
    private int luongCB;

    public GiaoVien(String maNgach, String hoTen, int luongCB) {
        this.maNgach = maNgach;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
    }
    
    private int bacLuong(){
        int k = Integer.parseInt(maNgach.substring(2));  
        return k;
    }
    
    private int phuCap(){
        if(maNgach.startsWith("HT"))
            return 2000000;
        else if(maNgach.startsWith("HP"))
            return 900000;
        else 
            return 500000;
    }
    
    private int thuNhap(){
        return luongCB * bacLuong() + phuCap();
    }
    
    public String getChucVu(){
        return "" + maNgach.charAt(0) + maNgach.charAt(1);
    }

    @Override
    public String toString() {
        return maNgach + " " + hoTen + " " + bacLuong() + " " + phuCap() + " " + thuNhap();
    }
    
    
}
