/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05022;

/**
 *
 * @author HP
 */
public class SinhVien {
    private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    public String getLop(){
        return lop;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
    }
    
    
}
