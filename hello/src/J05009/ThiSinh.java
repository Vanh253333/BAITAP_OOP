/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05009;

/**
 *
 * @author HP
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private Integer ma;
    private String ten, ns;
    private float d1, d2, d3;

    public ThiSinh(int ma, String ten, String ns, float d1, float d2, float d3) {
        this.ma = ma;
        this.ten = ten;
        this.ns = ns;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    
    private Float tong(){
        return d1 + d2 + d3;
    }
    
    public Float getTong(){
        return this.tong();
    }

    @Override
    public int compareTo(ThiSinh o) {
        int k = o.tong().compareTo(this.tong());
        if(k != 0)
            return k;
        else
            return ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + ns + ' ' + this.tong();
    }
    
    
    
}
