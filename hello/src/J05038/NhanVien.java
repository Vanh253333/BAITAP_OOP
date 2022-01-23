/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05038;

/**
 *
 * @author HP
 */
public class NhanVien implements Comparable<NhanVien>{
    private String ma, ten, chucVu;
    private int luongNgay, soCong;

    public NhanVien(int id, String ten, int luongNgay, int soCong, String chucVu) {
        this.ma = "NV" + String.format("%02d", id);
        this.ten = ten;
        this.luongNgay = luongNgay;
        this.soCong = soCong;
        this.chucVu = chucVu;
    }
    
    private long luongThang(){
        return luongNgay*soCong;
    }
    
    private long thuong(){
        if(soCong >= 25)
            return (luongThang()*20)/100;
        else if(soCong >= 22)
            return (luongThang()*10)/100;
        else
            return 0;
    }
    
    private int phuCap(){
     if(chucVu.equals("GD"))
         return 250000;
     else if(chucVu.equals("PGD"))
         return 200000;
     else if(chucVu.equals("TP"))
         return 180000;
     else 
         return 150000;
    }
    
    private Long thucLinh(){
        return luongThang() + thuong() + phuCap();
    }

    @Override
    public String toString() {
        return ma + " " + ten + ' ' + luongThang() + " " + thuong() + " " + phuCap() + " " + thucLinh();
    }
    
    public long getThucLinh(){
        return this.thucLinh();
    }

    @Override
    public int compareTo(NhanVien o) {
        return o.thucLinh().compareTo(this.thucLinh());
    }
    
    
}
