/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06001;

/**
 *
 * @author HP
 */
public class SanPham {
    private String ma, ten;
    private int gia1, gia2;

    public SanPham(String ma, String ten, int gia1, int gia2) {
        this.ma = ma;
        this.ten = ten;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }
    
    public int getGia1(){
        return gia1;
    }
    
    public int getGia2(){
        return gia2;
    }
    
    public String getTen(){
        return ten;
    }
    
    public String getMa(){
        return ma;
    }
}
