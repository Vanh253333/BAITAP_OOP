/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07034;

/**
 *
 * @author HP
 */
public class MonHoc implements Comparable<MonHoc>{
    private String ma, ten;
    private int soTC;

    public MonHoc(String ma, String ten, int soTC) {
        this.ma = ma;
        this.ten = ten;
        this.soTC = soTC;
    }

    @Override
    public int compareTo(MonHoc o) {
        return ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soTC;
    }
    
}
