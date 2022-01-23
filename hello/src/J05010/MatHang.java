/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05010;

/**
 *
 * @author HP
 */
public class MatHang implements Comparable<MatHang>{
    private int ma;
    private String ten, nhomHang;
    private double giaMua, giaBan;

    public MatHang(int ma, String ten, String nhomHang, double giaMua, double giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    private Double loiNhuan(){
        return giaBan - giaMua;
    }

    @Override
    public int compareTo(MatHang o) {
        return o.loiNhuan().compareTo(this.loiNhuan());
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhomHang + " " + String.format("%.2f", this.loiNhuan());
    }
    
    
}
