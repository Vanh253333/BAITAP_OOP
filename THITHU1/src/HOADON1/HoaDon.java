/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HOADON1;

/**
 *
 * @author HP
 */
public class HoaDon {
    private SanPham sp;
    private String ma;
    private int sl;

    public HoaDon(int id, SanPham sp, String ma, int sl) {
        this.sp = sp;
        this.ma = ma + "-" + String.format("%03d", id);
        this.sl = sl;
    }
    
    private long thanhTien(){
        if(ma.charAt(2) == '1')
            return (long)sl*sp.getGia1();
        else
            return (long) sl*sp.getGia2();
    }
    
    private long giam(){
        if(sl >= 150)
            return thanhTien()/2;
        if(sl >=100)
            return (thanhTien()*30)/100;
        if(sl >= 50)
            return (thanhTien()*15)/100;
        return 0;
    }
    
    private long phaiTra(){
        return thanhTien() - giam();
    }

    @Override
    public String toString() {
        return ma + " " + sp.getTen() + " " + giam() + " " + phaiTra();
    }
    
    
}
