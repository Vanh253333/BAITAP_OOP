/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07028;

/**
 *
 * @author HP
 */
public class GiangVien {
    private String ma, ten;
    private double gio;
    public GiangVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        this.gio = 0;
    }
    
    public double update(double k){
        gio += k;
        return gio;
    }
    
    public String getTen(){
        return ten;
    }
    
    public String getMa(){
        return ma;
    }

    @Override
    public String toString() {
        return ten + " " + String.format("%.2f", gio);
    }
    
    
}
