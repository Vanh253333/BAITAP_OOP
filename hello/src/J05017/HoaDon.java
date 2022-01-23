/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05017;

/**
 *
 * @author HP
 */
public class HoaDon implements Comparable<HoaDon>{
    private String ma, ten;
    private int moi, cu;

    public HoaDon(int id, String ten, int cu, int moi) {
        this.ma = "KH" + String.format("%02d", id);
        this.ten = ten;
        this.moi = moi;
        this.cu = cu;
    }
    
    private double phuPhi(){
        int k = moi - cu;
        if(k > 100)
            return 1.05;
        if(k > 50)
            return 1.03;
        return 1.02;
    }
    
    private Double tong(){
        int k = moi - cu;
        double tong = 0;
        if(k > 100){
            tong += (double)(k - 100)*200;
            k = 100;
        }           
        if(k > 50){
            tong += (double)(k - 50)*150;
            k = 50;
        }            
        tong += (double)k*100;
        return tong*phuPhi();
    }

    @Override
    public int compareTo(HoaDon o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return o.tong().compareTo(this.tong());
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + (int)Math.round(tong());
    }
    
    
}
