/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05007;

/**
 *
 * @author HP
 */
import java.text.*;
import java.util.Date;
public class NhanVien implements Comparable<NhanVien>{
    private String ma, hoTen, gioiTinh, diaChi, maThue;
    private Date ngaySinh, ngayKHD;

    public NhanVien(int id, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maThue, String ngayKHD) throws ParseException {
        this.ma = String.format("%05d", id);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        this.ngayKHD = new SimpleDateFormat("dd/mm/yyyy").parse(ngayKHD);
    }

    @Override
    public int compareTo(NhanVien o) {
        return ngaySinh.compareTo(o.ngaySinh);
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + gioiTinh + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh) + " " + diaChi + " " + maThue + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngayKHD);
    }
    
    
}
