/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05030;

/**
 *
 * @author HP
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma, ten, lop;
    private float d1, d2, d3;

    public SinhVien(String ma, String ten, String lop, float d1, float d2, float d3) {
        this.ten = ten;
        this.lop = lop;
        this.ma = ma;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public int compareTo(SinhVien o) {
        //return ma.compareTo(o.ma);
        return ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + String.format("%.1f", d1) + " " + String.format("%.1f", d2) + " " + String.format("%.1f", d3);
    }
    
    
}
