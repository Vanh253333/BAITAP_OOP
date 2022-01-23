/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04013;

import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class TuyenSinh implements Comparable<TuyenSinh>{
    private String ma, hoTen, trangThai;
    private double toan, ly, hoa;

    public TuyenSinh(String ma, String hoTen, double toan, double ly, double hoa) {
        this.ma = ma;
        this.hoTen = chuanHoa(hoTen);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
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
    
    private double diemUuTien(){
        if(ma.charAt(2) == '1')
            return 0.5;
        else if(ma.charAt(2) == '2')
            return 1;
        else
            return 2.5;
    }
    
    public Double tongDiem(){
        double tmp = toan*2 + ly + hoa + this.diemUuTien();
        return  tmp;
    }
    
    public void settrangThai(String s){
        this.trangThai = s;
    }
    
    private String xuLy(double n){
        if((n*10)%10 == 0 )
            return String.format("%.0f", n);
        else
            return  String.format("%.1f", n);
    }    

    @Override
    public String toString() {            
        return ma + " " + hoTen + " " + xuLy(this.diemUuTien()) + " " + xuLy(this.tongDiem()) + " " + trangThai;
    }

    @Override
    public int compareTo(TuyenSinh o) {
        int k = o.tongDiem().compareTo(this.tongDiem());
        if(k != 0)
            return k;
        else
            return ma.compareTo(o.ma);
    }   
}
