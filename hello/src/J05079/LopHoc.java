/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05079;

/**
 *
 * @author HP
 */
public class LopHoc implements Comparable<LopHoc>{
    private String ma, tenMH, nhom, tenGV;

    public LopHoc(String ma, String tenMH, String nhom, String tenGV) {
        this.ma = ma;
        this.tenMH = tenMH;
        this.nhom = nhom;
        this.tenGV = tenGV;
    }

    @Override
    public int compareTo(LopHoc o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(ma.compareTo(o.ma)==0)
            return nhom.compareTo(o.nhom);
	return ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + tenMH + " " + nhom ;
    }
    
    public String getMa(){
        return ma;
    }
    
    public String getTenMH(){
        return tenGV;
    }
    
}
