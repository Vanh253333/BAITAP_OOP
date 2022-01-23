/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06007;

/**
 *
 * @author HP
 */
public class GiangVien {
    private String ma, ten;
    public GiangVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    
    public String getTen(){
        return ten;
    }
    
    public String getMa(){
        return ma;
    }
    
}
