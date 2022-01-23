/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05074;

/**
 *
 * @author HP
 */
public class ChuyenCan {
    private String ma, dl;
    private SinhVien sv;

    public ChuyenCan(String ma, String dl, SinhVien sv) {
        this.ma = ma;
        this.dl = dl;
        this.sv = sv;
    }

    @Override
    public String toString() {
        return sv.getMa() + " " + sv.getTen() + " " + sv.getLop() + " " + this.diem() + " " + this.ghiChu();
    }
    
    private int diem(){
        int d = 10;
        for(int i = 0; i < dl.length(); i++){
            if(dl.charAt(i) == 'm')
                d -= 1;
            else if(dl.charAt(i) == 'v')
                d -= 2;
        }
        if(d > 0)
            return d;
        else
            return 0;
    }
    
    private String ghiChu(){
        if(diem() == 0)
            return "KDDK";
        else
            return "";
    }
    
    public String getMa(){
        return ma;
    }
    
     public String getLop(){
        return sv.getLop();
    }
}
