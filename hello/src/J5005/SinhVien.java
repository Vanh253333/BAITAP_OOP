/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J5005;

/**
 *
 * @author HP
 */
import java.text.*;
import java.util.*;

public class SinhVien implements Comparable<SinhVien>{
    private String maSV, hoTen, lop;
    private Float gpa;
    private Date ngaySinh;

    public SinhVien(int id, String hoTen, String lop, String ngaySinh, float gpa) throws ParseException {
        this.maSV = "B20DCCN" + String.format("%03d", id);
        this.hoTen = chuanHoa(hoTen);
        this.lop = lop;
        this.gpa = gpa;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
    }
    
    private String chuanHoa(String s){
        StringBuilder res = new StringBuilder();
        StringTokenizer str = new StringTokenizer(s);
        while(str.hasMoreTokens()){
            String tmp = str.nextToken();
            res.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i < tmp.length(); i++){
                res.append(Character.toLowerCase(tmp.charAt(i)));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }

    @Override
    public int compareTo(SinhVien o) {
        return o.gpa.compareTo(gpa);
    }

    @Override
    public String toString() {
        return maSV + " " + hoTen + " " + lop + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh) + " " + String.format("%.2f", gpa);
    }
  
}


