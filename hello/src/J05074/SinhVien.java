/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05074;

/**
 *
 * @author HP
 */
public class SinhVien {
    private String ma, ten, lop;

    public SinhVien(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }
    
    public String getMa(){
        return ma;
    }
    
    public String getTen(){
        return ten;
    }
    
    public String getLop(){
        return lop;
    }
}
