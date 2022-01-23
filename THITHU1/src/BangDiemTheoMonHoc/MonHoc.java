/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangDiemTheoMonHoc;

/**
 *
 * @author HP
 */
public class MonHoc {
    private String ma, ten, tc;

    public MonHoc(String ma, String ten, String tc) {
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
    }
    
    public String getMa(){
        return ma;
    }
    
    public String getTen(){
        return ten;
    }

    @Override
    public String toString() {
        return ma + " " + ten;
    }
    
}
