/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05046;

/**
 *
 * @author HP
 */
public class Hang implements Comparable<Hang>{
    private String ma, ten;
    private int sl;
    private long donGia;

    public Hang(String ma, String ten, int sl, long donGia) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
        this.donGia = donGia;
    }
    
    private Long chietKhau(){
        int tmp;
        if(sl > 10)
            tmp = 5;
        else if(sl <= 10 && sl >= 8)
            tmp = 2;
        else if(sl >= 5 && sl < 8)
            tmp = 1;
        else tmp = 0;
        return (donGia * sl * tmp)/100;
    }
    
    private long thanhTien(){
        return donGia * sl - chietKhau();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + chietKhau() + " " + thanhTien();
    }

    @Override
    public int compareTo(Hang o) {
        return o.chietKhau().compareTo(this.chietKhau());
    }
    
    
}
