/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07049;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class KhachHang implements Comparable<KhachHang>{
    private String maKH, tenKH, dc;
    private MuaHang sp;
    private int sl;
    private String ngayMua;

    public KhachHang(int id, String tenKH, String dc, MuaHang sp, int sl, String ngayMua) {
        this.maKH = "KH" + String.format("%02d", id);
        this.tenKH = tenKH;
        this.dc = dc;
        this.sp = sp;
        this.sl = sl;
        this.ngayMua = ngayMua;
    }
    
    private long tong(){
        return (long)sl*sp.getGia();
    }
    
    private Date ngayHetHan() throws ParseException{
        String s[] = ngayMua.split("/");
        int mm = sp.getThoiHan() + Integer.parseInt(s[1]);
        int yy = Integer.parseInt(s[2]);
        while(mm > 12){
            mm -= 12;
            yy += 1; 
        }
        return new SimpleDateFormat("dd/MM/yyyy").parse(s[0]+"/"+mm+"/"+yy);
    }

    @Override
    public int compareTo(KhachHang o) {
 	try {
            if(ngayHetHan().after(o.ngayHetHan())) return 1;
            else if(ngayHetHan().before(o.ngayHetHan())) return -1;
            else return maKH.compareTo(o.maKH);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	return 0;
    }

    @Override
    public String toString() {
        try {
            return maKH + " " + tenKH + " " + dc + " " + sp.getmaSP() + " " + tong() + " "  + new SimpleDateFormat("dd/MM/yyyy").format(ngayHetHan());
        } catch (ParseException ex) {
            Logger.getLogger(KhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
