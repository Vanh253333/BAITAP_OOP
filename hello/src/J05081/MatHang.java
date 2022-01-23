/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05081;

/**
 *
 * @author HP
 */
public class MatHang implements Comparable<MatHang>{
    private String ma, ten, dv;
    private int giaMua, giaBan;

    public MatHang(int id, String ten, String dv, int giaMua, int giaBan) {
        this.ma = "MH" + String.format("%03d", id);
        this.ten = ten;
        this.dv = dv;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    private Integer loiNhuan(){
        return giaBan - giaMua;
    }

    @Override
    public int compareTo(MatHang o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int k = o.loiNhuan().compareTo(this.loiNhuan());
        if(k != 0)
            return k;
        else
            return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + dv + " " + giaMua + " " + giaBan + ' ' + this.loiNhuan();
    }
    
    
    
}
