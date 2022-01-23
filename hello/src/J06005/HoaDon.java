/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06005;

/**
 *
 * @author HP
 */
public class HoaDon implements Comparable<HoaDon>{
    private String maHoaDon;
    private KhachHang nguoiMua;
    private MatHang sp;
    private int sl;


    public HoaDon(int id, KhachHang nguoiMua, MatHang sp, int sl) {
        this.maHoaDon = "HD" + String.format("%03d", id);
        this.nguoiMua = nguoiMua;
        this.sp = sp;
        this.sl = sl;
    }
    
    public long thanhTien(){
        return sl * sp.getGB();
    }
    
    public Long loiNhuan(){
        long k = (sp.getGB() - sp.getGM()) * sl;
        return k;
    }

    @Override
    public int compareTo(HoaDon o) {
        int k = o.loiNhuan().compareTo(this.loiNhuan());
        if(k != 0)
            return k;
        else
            return this.maHoaDon.compareTo(o.maHoaDon);
    }

    @Override
    public String toString() {
        return maHoaDon + " " + nguoiMua.getTenKH() + " " + nguoiMua.getDC() + " " + sp.getTenMH() + " " +  sl + " " + thanhTien() + " " +loiNhuan();
    }
    
    
}
