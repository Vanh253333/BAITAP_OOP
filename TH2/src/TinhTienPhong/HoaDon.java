/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhTienPhong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author HP
 */
public class HoaDon implements Comparable<HoaDon>{
    private String ma, ten, soPhong;
    private Date ngayNhan, ngayTra;
    private int tienDV;

    public HoaDon(int args, String ten, String soPhong, String ngayNhan, String ngayTra, int tienDV) throws ParseException {
        this.ma = "KH" + String.format("%02d", args);
        this.ten = chuanHoa(ten);
        this.soPhong = soPhong;
        this.ngayNhan = new SimpleDateFormat("dd/MM/yyyy").parse(ngayNhan);
        this.ngayTra = new SimpleDateFormat("dd/MM/yyyy").parse(ngayTra);;
        this.tienDV = tienDV;
    }
    
    private String chuanHoa(String s){
        StringBuilder res = new StringBuilder();
        StringTokenizer str = new StringTokenizer(s);
        while(str.hasMoreTokens()){
            String tmp = str.nextToken();
            res.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i< tmp.length(); i++){
                res.append(tmp.toLowerCase().charAt(i));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }

    private long soNgay(){
        TimeUnit time = TimeUnit.DAYS;
        return time.convert(ngayTra.getTime()-ngayNhan.getTime(), TimeUnit.MILLISECONDS) + 1;
    }
    
    private Long thanhTien(){
        if(soPhong.charAt(0) == '1')
            return 25*soNgay() + tienDV;
        if(soPhong.charAt(0) == '2')
            return 34*soNgay() + tienDV;
        if(soPhong.charAt(0) == '3')
            return 50*soNgay() + tienDV;
        return 80*soNgay() + tienDV;
    }

    @Override
    public int compareTo(HoaDon o) {
        return o.thanhTien().compareTo(thanhTien());
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soPhong + ' ' + soNgay() + " " + thanhTien();
    }
    
    
}
