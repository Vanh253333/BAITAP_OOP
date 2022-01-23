/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05013;

/**
 *
 * @author HP
 */
public class TuyenDung implements Comparable<TuyenDung>{
    private String ma,ten;
    private float d1, d2;

    public TuyenDung(int id, String ten, float d1, float d2) {
        this.ma = "TS" + String.format("%02d", id);
        this.ten = ten;
        this.d1 = d1;
        this.d2 = d2;
    }
    
    private Float diem(){
        if(d1 > 10 && d2 > 10)
            return (d1 + d2)/20;
        else if( d1 > 10 && d2 <= 10)
            return (d1/10 + d2)/2;
        else if( d1 <= 10 && d2 > 10)
            return (d1 + d2/10)/2;
        else
            return (d1 + d2)/2;
    }
    
    private String xl(){
        if(this.diem() > 9.5)
            return "XUAT SAC";
        else if(this.diem() >= 8)
            return "DAT";
        else if(this.diem() >= 5)
            return "CAN NHAC";
        else
            return "TRUOT";
    }

    @Override
    public int compareTo(TuyenDung o) {
        return o.diem().compareTo(this.diem());
    }

    @Override
    public String toString() {
        return ma + " " + ten + ' ' + String.format("%.2f", this.diem()) + " " + xl();
    }
    
    
}
    

