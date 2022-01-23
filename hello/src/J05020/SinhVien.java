/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05020;

/**
 *
 * @author HP
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        if(lop.compareTo(o.lop) != 0)
//            return lop.compareTo(o.lop);
//        else
            return ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
    }
    
}
