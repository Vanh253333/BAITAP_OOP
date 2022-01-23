/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06007;

/**
 *
 * @author HP
 */
public class LopHocPhan {
private GiangVien gv;
    private MonHoc mh;
    private double gioChuan;

    public LopHocPhan(GiangVien gv, MonHoc mh, double gioChuan) {
        this.gv = gv;
        this.mh = mh;
        this.gioChuan = gioChuan;
    }
    
    public double getGio(){
        return gioChuan;
    }
    
    public String getMaGV(){
        return gv.getMa();
    }
    
    public String getMaMH(){
        return mh.getMa();
    }
    
    
    @Override
    public String toString() {
        return mh.getTen() + " " + gioChuan;
    }
    
    
}
