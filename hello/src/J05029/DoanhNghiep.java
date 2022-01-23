/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05029;

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
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(o.soSV.compareTo(soSV) != 0)
            return o.soSV.compareTo(soSV);
        else
            return ma.compareTo(o.ma);
    }

    public int getSoSV(){
        return soSV;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soSV;
    }
}
