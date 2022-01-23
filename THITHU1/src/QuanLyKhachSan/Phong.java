/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyKhachSan;

/**
 *
 * @author HP
 */
public class Phong {
    private String loai, ten;
    private int gia;
    private double phi;

    public Phong(String s[]) {
        this.loai = s[0];
        this.ten = s[1];
        this.gia = Integer.parseInt(s[2]);
        this.phi = Double.parseDouble(s[3]);
    }
    
    public String getLoai(){
        return loai;
    }
    
    public int getGia(){
        return gia;
    }
    
    public double getPhi(){
        return phi;
    }
}
