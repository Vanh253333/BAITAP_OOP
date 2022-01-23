/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05069;

/**
 *
 * @author HP
 */
public class TranDau implements Comparable<TranDau>{
    private String ma;
    private long sl;
    private CLB clb;

    public TranDau(String ma, long sl, CLB clb) {
        this.ma = ma;
        this.sl = sl;
        this.clb = clb;
    }
    
    private Long doanhThu(){
        return sl * clb.getGia();
    }

    @Override
    public String toString() {
        return ma + " " + clb.getTen() + " " + this.doanhThu();
    }
    
    public String getMa(){
        return ma.substring(1, 3);
    }

    @Override
    public int compareTo(TranDau o) {
        int k = o.doanhThu().compareTo(this.doanhThu());
        if(k != 0)
            return k;
        else
            return this.clb.getTen().compareTo(o.clb.getTen());
    }
}
