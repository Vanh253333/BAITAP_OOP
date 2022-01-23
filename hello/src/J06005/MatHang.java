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
public class MatHang {
    private String ma, ten, donVi;
    private int giaMua, giaBan;

    public MatHang(int id, String ten, String donVi, int giaMua, int giaBan) {
        this.ma = "MH" + String.format("%03d", id);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    public String getMa(){
        return ma;
    }
    
    public int getGB(){
        return giaBan;
    }
    
    public int getGM(){
        return giaMua;
    }
    
    public String getTenMH(){
        return ten;
    }
    
    public String getDV(){
        return donVi;
    }
    
    
  
}
