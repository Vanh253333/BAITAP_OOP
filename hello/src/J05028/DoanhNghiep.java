/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05028;

/**
 *
 * @author HP
 */
public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma, ten;
    private Integer soSV;

    public DoanhNghiep(String ma, String ten, Integer soSV) {
        this.ma = ma;
        this.ten = ten;
        this.soSV = soSV;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(o.soSV.compareTo(soSV) != 0)
            return o.soSV.compareTo(soSV);
        else
            return ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soSV;
    }
    
    
    
}
