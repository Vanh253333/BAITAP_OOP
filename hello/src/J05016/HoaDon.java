/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05016;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author HP
 */
public class HoaDon implements Comparable<HoaDon>{
    private String ma, ten, soPhong;
    private Date ngayNhan, ngayTra;
    private int tienDv;

    public HoaDon(int id, String ten, String soPhong, String ngayNhan, String ngayTra, int tienDv) throws ParseException {
        this.ma = "KH" + String.format("%02d", id);
        this.ten = ten.trim();
        this.soPhong = soPhong.trim();
        this.ngayNhan = new SimpleDateFormat("dd/MM/yyyy").parse(ngayNhan.trim());
        this.ngayTra = new SimpleDateFormat("dd/MM/yyyy").parse(ngayTra.trim());;
        this.tienDv = tienDv;
    }
    
    private long soNgay(){       
        long diff = ngayTra.getTime() - ngayNhan.getTime();
        TimeUnit time = TimeUnit.DAYS; 
        return time.convert(diff, TimeUnit.MILLISECONDS) + 1;
    }
    
    private int donGia(){
        if(soPhong.charAt(0) == '1')
            return 25;
        if(soPhong.charAt(0) == '2')
            return 34;
        if(soPhong.charAt(0) == '3')
            return 50;
        return 80;
    }
    
    private Long thanhTien(){
        return soNgay()*donGia() + tienDv;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soPhong + " " + soNgay() + " " + thanhTien();
    }

    @Override
    public int compareTo(HoaDon o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return o.thanhTien().compareTo(this.thanhTien());
    }
    
    
}
