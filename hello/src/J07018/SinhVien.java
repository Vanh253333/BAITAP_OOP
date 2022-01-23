/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07018;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class SinhVien {
    private String ma, ten, lop;
    private Date ns;
    private float gpa;

    public SinhVien(int id, String ten, String lop, String ns, float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", id);
        this.ten = chuanHoa(ten);
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.gpa = gpa;
    }
    
    private String chuanHoa(String s){
        StringBuilder res = new StringBuilder();
        StringTokenizer str = new StringTokenizer(s);
        while(str.hasMoreTokens()){
            String tmp = str.nextToken();
            res.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i < tmp.length(); i++){
                res.append(tmp.toLowerCase().charAt(i));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
    

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + String.format("%.2f", gpa);
    }
    
    
}
