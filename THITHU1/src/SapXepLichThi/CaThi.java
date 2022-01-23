/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SapXepLichThi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HP
 */
public class CaThi{
    private String maCa, phong;
    private Date ngay, gio;

    public CaThi(int id, String ngay, String gio, String phong) throws ParseException {
        this.maCa = "C" + String.format("%03d", id);
        this.phong = phong;
        this.ngay = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        this.gio = new SimpleDateFormat("HH:mm").parse(gio);;
    }

    @Override
    public String toString() {
        return new SimpleDateFormat("dd/MM/yyyy").format(ngay) + " " + new SimpleDateFormat("HH:mm").format(gio) + " " + phong;
    }
    
    public String getMaCa(){
        return maCa;
    }

    public Date getNgay(){
        return ngay;
    }
    
    public Date getGio(){
        return gio;
    }
}
