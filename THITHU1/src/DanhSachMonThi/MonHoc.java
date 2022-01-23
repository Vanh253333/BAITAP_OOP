/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSachMonThi;

/**
 *
 * @author HP
 */
public class MonHoc implements Comparable<MonHoc>{
    private String ma, ten, hinhThuc;

    public MonHoc(String ma, String ten, String hinhThuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + hinhThuc;
    }


    @Override
    public int compareTo(MonHoc o) {
        return ma.compareTo(o.ma);
    }


    
    
}
