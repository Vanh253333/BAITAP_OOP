/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04005;

/**
 *
 * @author HP
 */
import java.util.*;
import java.text.*;

public class ThiSinh {
    private String hoTen;
    private Date ngaySinh;
    private float diem1, diem2, diem3;

    public ThiSinh(String hoTen, String ngaySinh, float diem1, float diem2, float diem3) throws ParseException {
        this.hoTen = hoTen;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    
    private float tong(){
        return diem1 + diem2 + diem3;
    }

    @Override
    public String toString() {
        return hoTen + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh) + " " + tong();
    }   
}
