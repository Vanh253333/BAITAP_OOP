/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04007;

/**
 *
 * @author HP
 */
import java.util.*;
import java.text.*;

public class NhanVien {
    private String hoTen, gioiTinh, diaChi, maThue, maNV;
    private Date ngaySinh, ngayKyHD;

    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maThue, String ngayKyHD) throws ParseException {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        this.ngayKyHD = new SimpleDateFormat("dd/mm/yyyy").parse(ngayKyHD);
        this.maNV = "00001";
    }

    @Override
    public String toString() {
        return maNV + " " + hoTen + " " + gioiTinh + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh) + " " + diaChi + " " + maThue + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngayKyHD);
    }
    
    
    
}
