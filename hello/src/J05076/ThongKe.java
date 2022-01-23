/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05076;

/**
 *
 * @author HP
 */
public class ThongKe {
    private MatHang mh;
    private long donGia;
    private int slNhap, slXuat;

    public ThongKe(MatHang mh, int slNhap, long donGia, int slXuat) {
        this.mh = mh;
        this.donGia = donGia;
        this.slNhap = slNhap;
        this.slXuat = slXuat;
    }
    
    private long gtNhap(){
        return (long) slNhap*donGia;
    }
    
    private long gtXuat(){
        long tong = donGia*slXuat*(100+mh.laiSuat())/100;
	return (long) Math.round(tong/10)*10;
    }

    @Override
    public String toString() {
        return mh.getMa() + " " + mh.getTen() + " " + gtNhap() + " " + gtXuat();
    }
    
    
}
