/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06003;

/**
 *
 * @author HP
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma, ten, sdt;
    private int stt;

    public SinhVien(String ma, String ten, String sdt, int stt) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.stt = stt;
    }
    
    public String getMa(){
        return ma;
    }
    
    public String getTen(){
        return ten;
    }
    
    public String getSDT(){
        return sdt;
    }
    
    public int getSTT(){
        return stt;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + sdt + " " + stt;
    }

    @Override
    public int compareTo(SinhVien o) {
        return ma.compareTo(o.ma);
    }
    
    
}
