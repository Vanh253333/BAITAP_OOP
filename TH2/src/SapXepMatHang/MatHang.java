/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SapXepMatHang;

/**
 *
 * @author HP
 */
public class MatHang implements Comparable<MatHang>{
    private String ma, ten, nhom;
    private double giaMua, giaBan;

    public MatHang(int id, String ten, String nhom, double giaMua, double giaBan) {
        this.ma = "MH" + String.format("%02d", id);
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    private Double loiNhuan(){
        return giaBan - giaMua;
    }

    @Override
    public int compareTo(MatHang o) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return o.loiNhuan().compareTo(this.loiNhuan());
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom + ' ' + String.format("%.2f", loiNhuan());
    }
    
    
}
