/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05014;

/**
 *
 * @author HP
 */
public class GiaoVien implements Comparable<GiaoVien>{
    private String ma, ten, maXT;
    private float d1, d2;

    public GiaoVien(int id, String ten, String maXT, float d1, float d2) {
        this.ma = "GV" + String.format("%02d", id);
        this.ten = ten;
        this.maXT = maXT;
        this.d1 = d1;
        this.d2 = d2;
    }
    
    private String monHoc(){
        if(maXT.charAt(0) == 'A')
            return "TOAN";
        else if(maXT.charAt(0) == 'B')
            return "LY";
        else
            return "HOA";
    }
    
    private double uuTien(){
        if(maXT.charAt(1) == '1')
            return 2.0;
        else if(maXT.charAt(1) == '2')
            return 1.5;
        else if(maXT.charAt(1) == '3')
            return 1;
        else
            return 0;
    }
    
    private Double tong(){
        return d1*2 + d2 + this.uuTien();
    }
    
    private String xl(){
        if(this.tong() >= 18)
            return "TRUNG TUYEN";
        else
            return "LOAI";
    }

    @Override
    public int compareTo(GiaoVien o) {
        return o.tong().compareTo(this.tong());
    }

    @Override
    public String toString() {
        return ma + " " + ten + ' ' + this.monHoc() + " " + String.format("%.1f", this.tong()) + " " + this.xl();
    }
    
    
}
