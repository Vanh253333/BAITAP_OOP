/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07037;

/**
 *
 * @author HP
 */
public class DoanhNghiep implements Comparable<DoanhNghiep>{
     private String maDN, tenDN;
    private int soSV;

    public DoanhNghiep(String maDN, String tenDN, int soSV) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soSV = soSV;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        return maDN.compareTo(o.maDN);
    }

    @Override
    public String toString() {
        return maDN + " " + tenDN + " " + soSV;
    }


    
}
