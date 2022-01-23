/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05034;

/**
 *
 * @author HP
 */
public class ThucTap implements Comparable<ThucTap>{
    private int stt;
    private String ma, ten, lop, email, dn;

    public ThucTap(int id, String ma, String ten, String lop, String email, String dn) {
        this.stt = id;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }

    @Override
    public String toString() {
        return stt + " " + ma + " " + ten + " " + lop + " " + email + " " + dn;
    }
    
    public String getDN(){
        return dn;
    }

    @Override
    public int compareTo(ThucTap o) {
        //return ten.compareTo(o.ten);
        return ma.compareTo(o.ma);
    }
    
    
}
