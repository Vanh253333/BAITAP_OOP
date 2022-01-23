/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBaiTapNhom;

/**
 *
 * @author HP
 */
public class Nhom implements Comparable<Nhom>{
    private SinhVien sv;
    private BaiTap bt;

    public Nhom(SinhVien sv, BaiTap bt) {
        this.sv = sv;
        this.bt = bt;
    }

    @Override
    public String toString() {
        return sv.toString() + " " + bt.toString();
    }

    @Override
    public int compareTo(Nhom o) {
        return sv.getMaSV().compareTo(o.sv.getMaSV());
    }
    
    
}
