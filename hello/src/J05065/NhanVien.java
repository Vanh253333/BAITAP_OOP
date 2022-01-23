/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05065;

/**
 *
 * @author HP
 */
public class NhanVien implements Comparable<NhanVien>{
    private String ma, ten;

    public NhanVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    
    public String chucVu(){
        return ma.substring(0, 2);
    }
    
    private String bacLuong(){
        return ma.substring(2, 4);
    }
    
    private String soHieu(){
        return ma.substring(4);
    }
    
    public String getTen(){
        return ten.toLowerCase();
    }

    @Override
    public int compareTo(NhanVien o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int k = o.bacLuong().compareTo(this.bacLuong());
        if(k != 0)
            return k;
        else
            return this.soHieu().compareTo(o.soHieu());
    }

    @Override
    public String toString() {
        return ten + " " + this.chucVu() + " " + this.soHieu() + " " + this.bacLuong();
    }
    
    
}
