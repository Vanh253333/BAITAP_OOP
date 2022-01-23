/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07059;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HP
 */
public class CaThi implements Comparable<CaThi>{
    private String ma, phong;
    private Date ngay, gio;

    public CaThi(int id, String ngay, String gio, String phong) throws ParseException {
        this.ma = "C" + String.format("%03d", id);
        this.phong = phong;
        this.ngay = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        this.gio = new SimpleDateFormat("HH:mm").parse(gio);
    }

    @Override
    public int compareTo(CaThi o) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int k = ngay.compareTo(o.ngay);
        if(k != 0)
            return k;
        else{
            int t = gio.compareTo(o.gio);
            if(t != 0)
                return t;
            else
                return ma.compareTo(o.ma);
        }
    }

    @Override
    public String toString() {
        return ma + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngay) + " " + new SimpleDateFormat("HH:mm").format(gio) + " " + phong;
    }
    
    
    
}
