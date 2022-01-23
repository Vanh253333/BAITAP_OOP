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
public class HoaDon {
    private String maHD;
    private KhachHang kh;
    private MatHang mh;
    private int sl;

    public HoaDon(int args, KhachHang kh, MatHang mh, int sl) {
        this.maHD = "HD" + String.format("%03d", args);
        this.kh = kh;
        this.mh = mh;
        this.sl = sl;
    }
    
    private long thanhTien(){
        return (long)sl*mh.getGiaBan();
    }

    @Override
    public String toString() {
        return maHD + " " + kh.toString() + " " + mh.toString() + " " + sl + ' ' + thanhTien();
    }
    
    
}
