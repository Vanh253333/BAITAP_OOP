/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05052;

/**
 *
 * @author HP
 */
public class DonHang implements Comparable<DonHang>{
    private String ten, ma;
    private long donGia;
    private int sl;

    public DonHang(String ten, String ma, long donGia, int sl) {
        this.ten = ten;
        this.ma = ma;
        this.donGia = donGia;
        this.sl = sl;
    }
    
    private Integer stt(){
        return Integer.parseInt(ma.substring(1, 4));
    }
    
    private long giamGia(){
        if(ma.charAt(ma.length()-1) == '1')
            return (donGia * sl * 50)/100;
        else
            return (donGia * sl * 30)/100;
    }
    
    private long thanhTien(){
        return donGia * sl - giamGia();
    }

    @Override
    public String toString() {
        return ten + " " + ma + " " + String.format("%03d", stt()) + " " + giamGia() + " " + thanhTien();
    }

    @Override
    public int compareTo(DonHang o) {
        return this.stt().compareTo(o.stt());
    }
    
    
}
