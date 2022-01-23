/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSachDoanhNghiep;

/**
 *
 * @author HP
 */
public class ThucTap implements Comparable<ThucTap>{
    private SinhVien sv;
    private DoanhNghiep dn;

    public ThucTap(SinhVien sv, DoanhNghiep dn) {
        this.sv = sv;
        this.dn = dn;
    }
    
    public String getDN(){
        return dn.getMaDN();
    }

    @Override
    public String toString() {
        return sv.getMaSV() + " " + sv.getTenSV() + " " + sv.getLop();
    }

    @Override
    public int compareTo(ThucTap o) {
        return sv.getMaSV().compareTo(o.sv.getMaSV());
    }
    
    
}
