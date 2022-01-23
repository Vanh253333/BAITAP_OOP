/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05082;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class KhachHang implements Comparable<KhachHang>{
    private String ma, ten, gt, dc;
    private Date ns;

    public KhachHang(int id, String ten, String gt, String ns, String dc) throws ParseException {
        this.ma = "KH" + String.format("%03d", id);
        this.ten = chuanHoa(ten);
        this.gt = gt;
        this.dc = dc;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
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

    @Override
    public int compareTo(KhachHang o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return ns.compareTo(o.ns);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gt + " " + dc + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) ;
    }
    
}
