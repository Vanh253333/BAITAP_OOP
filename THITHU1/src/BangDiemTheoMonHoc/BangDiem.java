/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangDiemTheoMonHoc;

/**
 *
 * @author HP
 */
public class BangDiem implements Comparable<BangDiem>{
    private SinhVien sv;
    private MonHoc mh;
    private String diem;

    public BangDiem(SinhVien sv, MonHoc mh, String diem) {
        this.sv = sv;
        this.mh = mh;
        this.diem = diem;
    }
    
    private Double diem(){
        Double d = Double.parseDouble(diem);
        return d;
    }
    
    public String getMaMH(){
        return mh.getMa();
    }
    
    public String getTenMH(){
        return mh.getTen();
    }
    
    public String getMaLop(){
        return sv.getLop();
    }

    @Override
    public int compareTo(BangDiem o) {
        int k = mh.getMa().compareTo(o.mh.getMa());
        if(k != 0){
            return k;
        }else
            return sv.getMaSV().compareTo(o.sv.getMaSV());
    }

    @Override
    public String toString() {
        return sv.toString() + " " + mh.toString() + " " + diem;
    }
    
    
    
    
}
