/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05033;

/**
 *
 * @author HP
 */

public class ThoiGian implements Comparable<ThoiGian>{
    private Integer h, m, s;

    public ThoiGian(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public Integer getH(){
        return h;
    }
    
    public Integer getS(){
        return s;
    }
    public Integer getM(){
        return m;
    }

    @Override
    public int compareTo(ThoiGian o) {
        int compareH = getH().compareTo(o.getH());
        if(compareH != 0)
            return compareH;
        else{
            int compareM = getM().compareTo(o.getM());
            if(compareM != 0)
                return compareM;
            else
                return getS().compareTo(o.getS());
        }
    }

    @Override
    public String toString() {
        return h + " " + m + " " + s;
    }
   
    
}
