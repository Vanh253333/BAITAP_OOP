/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhGioChuan;

/**
 *
 * @author HP
 */
public class GiangVien {
    private String maGV, tenGV;
    private double gioChuan;

    public GiangVien(String maGV, String tenGV) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.gioChuan = 0;
    }
    
    public String getTenGV(){
        return tenGV;
    }
    
    public double update(double n){
        gioChuan += n;
        return gioChuan;
    }
    
    public String getMaGV(){
        return maGV;
    }
    
    
    @Override
    public String toString() {
        return tenGV + " " + String.format("%.2f", gioChuan);
    }
}
