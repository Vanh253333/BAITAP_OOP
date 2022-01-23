/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07048;

/**
 *
 * @author HP
 */
public class SanPham implements Comparable<SanPham>{
    private String ma, ten;
    private Integer gia, thoiHan;

    public SanPham(String ma, String ten, Integer gia, Integer thoiHan) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.thoiHan = thoiHan;
    }

    @Override
    public int compareTo(SanPham o) {
        int k = o.gia.compareTo(gia);
        if(k!=0)
            return k;
        else
            return ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + thoiHan;
    }
    
    
}
