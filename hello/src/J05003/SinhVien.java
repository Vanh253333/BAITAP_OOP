/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05003;

/**
 *
 * @author HP
 */
import java.util.*;
import java.text.*;

public class SinhVien {
    private String mSV, hoTen, lop;
    private Date ngaySinh;
    private float gpa;

    public SinhVien(int id, String hoTen, String lop, String ngaySinh, float gpa) throws ParseException {
        this.mSV = "B20DCCN" + String.format("%03d", id);
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return mSV + " " + hoTen + " " + lop + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh) + " " + String.format("%.2f", gpa) ;
    }
    
            
}
