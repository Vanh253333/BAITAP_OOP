/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07020;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HP
 */
public class KhachHang {
    private String maKH, tenKH, gt, dc;
    private Date ns;

    public KhachHang(int id, String tenKH, String gt, String ns, String dc) throws ParseException {
        this.maKH = "KH" + String.format("%03d", id);
        this.tenKH = tenKH;
        this.gt = gt;
        this.dc = dc;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
    }
    
    public String getMaKH(){
        return maKH;
    }
    
    public String getTenKH(){
        return tenKH;
    }
    
    public String getDC(){
        return dc;
    }
    
}
