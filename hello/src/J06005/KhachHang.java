/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06005;

import java.util.Date;
import java.text.*;
/**
 *
 * @author HP
 */
public class KhachHang {
    private String ma, ten, gt, dc;
    private Date ns;

    public KhachHang(int id, String ten, String gt, String ns, String dc) throws ParseException {
        this.ma = "KH" + String.format("%03d", id);
        this.ten = ten;
        this.gt = gt;
        this.ns = new SimpleDateFormat("dd/mm/yyyy").parse(ns);
        this.dc = dc;
    }
    
    public String getMa(){
        return ma;
    }

    public String getDC(){
        return dc;
    }
    
    public String getTenKH(){
        return ten;
    }
}
