/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05024;

/**
 *
 * @author HP
 */
public class SinhVien {
     private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    
 public String getNganh(){
        String s = ""+this.ma.charAt(5)+this.ma.charAt(6);
        if(lop.charAt(0)=='E'){
            if(s.equals("CN")||s.equals("AT"))
            return "";
        }
        if(s.equals("CN")){
            return "Cong nghe thong tin";
        }
        if(s.equals("KT"))
            return "Ke toan";
        if(s.equals("AT")){
            return "An toan thong tin";
        }
        if(s.equals("VT"))
            return "Vien thong";
        if(s.equals("DT"))
            return "Dien tu";
         return null;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
    }
}
