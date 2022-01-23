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
public class HoaDon implements Comparable<HoaDon>{
    private String ma, ten;
    private int sl;
    private long thanhTien;

    public HoaDon(int id, String ma, int sl) {
        this.ma = ma + maHD(id);
        this.sl = sl;
        this.thanhTien = 0;
        this.ten = "";
    }
    
    private String maHD(int id){
        StringBuilder res = new StringBuilder();
       // res.append(ma);
        res.append("-");
        res.append(String.format("%03d", id));
        return res.toString();
    }
    
    public char getMaGia(){
        return ma.charAt(2);
    }
    
    public String getMa(){
        return ma.substring(0, 2);
    }
    
    public void setThanhTien(int gia){
        this.thanhTien = sl*gia;
    }
    
    public void setTen(String s){
        this.ten = s;
    }
    
    private long giamGia(){
        if(sl >= 150)
            return this.thanhTien/2;
        else if(sl >= 100)
            return (this.thanhTien*30)/100;
        else if(sl >= 50)
            return (this.thanhTien*15)/100;
        else
            return 0;
    }
    
    private Long tien(){
        return this.thanhTien - this.giamGia();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " +  this.giamGia() + " " +this.tien();
    }

    @Override
    public int compareTo(HoaDon o) {
        return o.tien().compareTo(this.tien());
    }
    
    
}
