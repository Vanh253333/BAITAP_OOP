/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05012;

/**
 *
 * @author HP
 */
public class MayLanh implements Comparable<MayLanh>{
    private String ma, ten;
    private int sl;
    private long donGia, ck;

    public MayLanh(String ma, String ten, int sl, long donGia, long ck) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
        this.donGia = donGia;
        this.ck = ck;
    }
    
    private Long tongTien(){
        return sl*donGia - ck;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sl + " " + donGia + " " + ck + ' ' + this.tongTien();
    }

    @Override
    public int compareTo(MayLanh o) {
        return o.tongTien().compareTo(this.tongTien());
    }
    
    
}
