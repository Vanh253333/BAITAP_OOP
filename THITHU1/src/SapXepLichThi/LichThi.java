/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SapXepLichThi;

/**
 *
 * @author HP
 */
public class LichThi implements Comparable<LichThi>{
    private CaThi ct;
    private MonHoc mh;
    private String nhom, soSV;

    public LichThi(CaThi ct, MonHoc mh, String nhom, String soSV) {
        this.ct = ct;
        this.mh = mh;
        this.nhom = nhom;
        this.soSV = soSV;
    }
    
    public String getMaCaThi(){
        return ct.getMaCa();
    }

    @Override
    public int compareTo(LichThi o) {
        int a = ct.getNgay().compareTo(o.ct.getNgay());
        if(a != 0)
            return a;
        else if(ct.getGio().compareTo(o.ct.getGio()) != 0){
                return ct.getGio().compareTo(o.ct.getGio());
        }else
            return ct.getMaCa().compareTo(o.ct.getMaCa());

    }

    @Override
    public String toString() {
        return ct.toString() + " " + mh.getTenMH() + " " + nhom + " " + soSV;
    }
    
    
}
