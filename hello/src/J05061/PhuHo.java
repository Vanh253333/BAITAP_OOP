/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05061;

/**
 *
 * @author HP
 */
public class PhuHo implements Comparable<PhuHo>{
    private String ma, ten, ns;
    private float d1, d2;

    public PhuHo(int id, String ten, String ns, float d1, float d2) {
        this.ma = "PH" + String.format("%02d", id);
        this.ten = ten;
        this.ns = ns;
        this.d1 = d1;
        this.d2 = d2;
    }
    
    private double diemThuong(){
        if(d1 >= 8 && d2 >= 8)
            return 1;
        else if(d1 >= 7.5 && d2 >= 7.5)
            return 0.5;
        else
            return 0;
    }
    
    private Integer diemTB(){
        double tmp = (d1 + d2)/2 + this.diemThuong();
        if(tmp >= 10)
            return 10;
        else
            return (int)Math.round(tmp);
    }
    
    private String xl(){
        if(this.diemTB() >= 9)
            return "Xuat sac";
        else if(this.diemTB() == 8)
            return "Gioi";
        else if(this.diemTB() == 7)
            return "Kha";
        else if(this.diemTB() >= 5)
            return "Trung binh";
        else
            return "Truot";
    }
    
    private int tuoi(){
        String[] tmp = ns.split("/");
        return 2021 - Integer.parseInt(tmp[2]);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + this.tuoi() + ' ' + this.diemTB() + " " + this.xl();
    }

    @Override
    public int compareTo(PhuHo o) {
        int k = o.diemTB().compareTo(this.diemTB());
        if(k != 0)
            return k;
        else 
            return this.ma.compareTo(o.ma);
    }
    
    
}
