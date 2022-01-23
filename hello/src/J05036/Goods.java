/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05036;

/**
 *
 * @author HP
 */
public class Goods implements Comparable<Goods>{
    private String ma, ten, dv;
    private int donGia, sl;

    public Goods(int id, String ten, String dv, int donGia, int sl) {
        this.ma = "MH" + String.format("%02d", id);
        this.ten = ten;
        this.dv = dv;
        this.donGia = donGia;
        this.sl = sl;
    }
    
    private long phiVC(){
        return (long)Math.round((donGia * sl * 5.0)/100);
    }
    
    private long thanhTien(){
        return (long)Math.round((donGia * sl + phiVC())*1.0);
    }
    
    private Long giaBan(){
        return (long)(Math.ceil(((thanhTien()*102.0/100)/sl)/100)*100);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + dv + ' ' + phiVC() + " " + thanhTien() + " " + giaBan();
    }

    @Override
    public int compareTo(Goods o) {
        return o.giaBan().compareTo(this.giaBan());
    }
    
    
}
