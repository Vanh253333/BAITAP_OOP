/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HOADON2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HP
 */
public class KhachHang {
    private String maKH, tenKH, gt;
    private Date ns;
    private String dc;

    public KhachHang(int id, String tenKH, String gt, String ns, String dc) throws ParseException {
        this.maKH = "KH" + String.format("%03d", id);
        this.tenKH = tenKH;
        this.gt = gt;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.dc = dc;
    }
    
    public String getMaKH(){
        return maKH;
    }

    @Override
    public String toString() {
        return tenKH + " " + dc;
    }
    
    
}
