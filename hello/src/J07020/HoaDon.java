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
public class HoaDon {
    private String maHD;
    private KhachHang kh;
    private MatHang mh;
    private int sl;

    public HoaDon(int id, KhachHang kh, MatHang mh, int sl) {
        this.maHD = "HD" + String.format("%03d", id);
        this.kh = kh;
        this.mh = mh;
        this.sl = sl;
    }

    
    private long thanhTien(){
        return sl*mh.getGB();
    }

    @Override
    public String toString() {
        return maHD + " " + kh.getTenKH() + " " + kh.getDC() + " " + mh.getTenMH() + " " + mh.getDV() + " " + mh.getGM() + " " + mh.getGB() + " " + sl + " " + this.thanhTien();
    }
    
    
}
