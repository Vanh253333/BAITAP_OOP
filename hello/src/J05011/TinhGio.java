/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05011;

/**
 *
 * @author HP
 */
public class TinhGio implements Comparable<TinhGio>{
    private String ma, ten, vao, ra;

    public TinhGio(String ma, String ten, String vao, String ra) {
        this.ma = ma;
        this.ten = ten;
        this.vao = vao;
        this.ra = ra;
    }
    
    public String thoiGian(){  
        return (soPhut()/60) + " gio " + (soPhut()%60) + " phut";
    }
    
    private int soPhut(){
        String[] a = vao.split(":");
        String[] b = ra.split(":");
        int phutA = Integer.parseInt(a[0]) * 60 + Integer.parseInt(a[1]);
        int phutB = Integer.parseInt(b[0]) * 60 + Integer.parseInt(b[1]);
        return phutB - phutA;
    }

    @Override
    public int compareTo(TinhGio o) {
        if (soPhut() < o.soPhut())
            return 1;
        else if(soPhut() > o.soPhut())
            return -1;
        else
            return 0;       
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + thoiGian();
    }  
}
