/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05054;

/**
 *
 * @author HP
 */
public class HocSinh implements Comparable<HocSinh>{
    private String ma, hoTen;
    private Float diemTB;

    public HocSinh(int id, String hoTen, Float diemTB) {
        this.ma = "HS" + String.format("%02d", id);
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
    
    private String xepLoai(){
        if(diemTB >= 9.0)
            return "Gioi";
        else if(diemTB >= 7)
            return "Kha";
        else if(diemTB >= 5)
            return "Trung Binh";
        else
            return "Yeu";
    }
    
    public float getDiemTB(){
        return diemTB;
    }

    @Override
    public int compareTo(HocSinh o) {
        return o.diemTB.compareTo(this.diemTB);
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + diemTB + ' ' + xepLoai();
    }
    
    
}
