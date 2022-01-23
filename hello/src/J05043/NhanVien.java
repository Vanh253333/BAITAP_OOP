/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05043;

/**
 *
 * @author HP
 */
public class NhanVien implements Comparable<NhanVien>{
    private String ma, ten, chucVu;
    private int luongCB, soCong;

    public NhanVien(int id, String ten, String chucVu, int luongCB, int soCong) {
        this.ma = "NV" + String.format("%02d", id);
        this.ten = ten;
        this.chucVu = chucVu;
        this.luongCB = luongCB;
        this.soCong = soCong;
    }
    
    private int phuCap(){
        if(chucVu.equals("GD"))
            return 500;
        else if(chucVu.equals("PGD"))
            return 400;
        else if(chucVu.equals("TP"))
            return 300;
        else if(chucVu.equals("KT"))
            return 250;
        else return 100;
    }
    
    private int luong(){
        return luongCB * soCong;
    }
    
    private int tamUng(){
        double tmp = 2*(luong() + phuCap())/3;
        int k = (int)(Math.round(tmp/1000)*1000);
        if(k < 25000)
            return k;
        return 25000;
        
    }
    
    private int conLai(){
        return luong() + phuCap() - tamUng();
    }
    
    private Integer thuNhap(){
        return luong() + phuCap();
    }
    
    public String getCV(){
        return chucVu;
    }

    @Override
    public int compareTo(NhanVien o) {
        int tmp = o.thuNhap().compareTo(this.thuNhap());
        if(tmp != 0)
            return tmp;
        else
            return ma.compareTo(o.ma);
    }
    
    

    @Override
    public String toString() {
        return ma + " " + ten + " " + phuCap() + " " + luong() + " " + tamUng() + " " + conLai();
    }
    
    
}
