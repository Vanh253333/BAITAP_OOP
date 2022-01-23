/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05069;

/**
 *
 * @author HP
 */
public class CLB {
    private String ma, ten;
    private int gia;

    public CLB(String ma, String ten, int gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }
    
    public String getMa(){
        return ma;
    }
    
    public String getTen(){
        return ten;
    }
    
    public int getGia(){
        return gia;
    }
    
    
}
