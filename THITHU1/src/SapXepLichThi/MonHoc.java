/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SapXepLichThi;

/**
 *
 * @author HP
 */
public class MonHoc {
    private String maMH, ten, hinhThuc;

    public MonHoc(String ma, String ten, String hinhThuc) {
        this.maMH = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }

    public String getMaMH(){
        return maMH;
    }

    public String getTenMH(){
        return ten;
    }
}
