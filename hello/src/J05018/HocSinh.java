/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05018;

/**
 *
 * @author HP
 */

public class HocSinh implements Comparable<HocSinh>{
    private String ma, ten, diem;

    public HocSinh(int id, String ten, String diem) {
        this.ma = "HS" + String.format("%02d", id);
        this.ten = ten;
        this.diem = diem;
    }
    
    private Double diemTB(){
        String[] ds = diem.split("\\s+");
        double tb = Double.parseDouble(ds[0])*2 + Double.parseDouble(ds[1])*2;
        for(int i = 2; i < ds.length; i++){
            tb += Double.parseDouble(ds[i]);
        }        
        return (double)Math.round((tb/12)*10.0)/10.0;
    }
    
    private String xepLoai(){
        if(diemTB() > 9.0)
            return "XUAT SAC";
        else if(diemTB() >= 8.0)
            return "GIOI";
        else if(diemTB() >= 7.0)
            return "KHA";
        else if(diemTB() >= 5.0)
            return "TB";
        else 
            return "YEU";
    }

    @Override
    public int compareTo(HocSinh o) {
        int compareD = o.diemTB().compareTo(this.diemTB());
        if(compareD != 0)
            return compareD;
        else{
            return ma.compareTo(o.ma);
        }
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + diemTB() + " " + xepLoai();
    }    
    
}
