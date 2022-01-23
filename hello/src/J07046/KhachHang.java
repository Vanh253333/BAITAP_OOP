/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07046;

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
    public KhachHang(int i, String ten, String maPhong, String ngayDen, String ngayDi) throws ParseException {
	this.maKH = "KH"+String.format("%02d", i);;
	this.ten = ten;
	this.maPhong = maPhong;
	this.ngayDen = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDen);
	this.ngayDi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDi);
    }

    public Long soNgay(){
        TimeUnit time = TimeUnit.DAYS; 
        return time.convert(ngayDi.getTime()-ngayDen.getTime(), TimeUnit.MILLISECONDS);
    }
    
    @Override
    public String toString() {
	return maKH+" "+ten+" "+maPhong+" "+soNgay();
    }

    @Override
    public int compareTo(KhachHang o) {
	return o.soNgay().compareTo(soNgay());
    }
}
