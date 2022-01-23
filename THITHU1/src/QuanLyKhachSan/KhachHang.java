/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyKhachSan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author HP
 */
public class KhachHang implements Comparable<KhachHang>{
    private String maKH, ten, maPhong;
    private Date ngayDen, ngayDi;
    private Phong p;

    public KhachHang(int args, String ten, String maPhong, String ngayDen, String ngayDi, Phong p) throws ParseException {
        this.maKH = "KH" + String.format("%02d", args);
        this.ten = ten;
        this.maPhong = maPhong;
        this.ngayDen = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDen);
        this.ngayDi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDi);
        this.p = p;
    }
    
    private Long soNgay(){
        TimeUnit time = TimeUnit.DAYS;
        return  time.convert(ngayDi.getTime() - ngayDen.getTime(), TimeUnit.MILLISECONDS);
    }
    
    private double thanhTien(){
        if(soNgay() == 0)
            return p.getGia()*(1 + p.getPhi());
        return (double)soNgay()*p.getGia()*(1 + p.getPhi());
    }
    
    
    private double phaiTra(){
        if(soNgay() >= 30)
            return thanhTien()*94/100;
        if(soNgay() >= 20)
            return thanhTien()*96/100;
        if(soNgay() >= 10)
            return thanhTien()*98/100;
        return thanhTien();
    }

    @Override
    public String toString() {
        return maKH + " " + ten + " " + maPhong + ' ' + soNgay() + " " + String.format("%.2f", phaiTra());
    }

    @Override
    public int compareTo(KhachHang o) {
        return o.soNgay().compareTo(soNgay());
    }
    
    
}
