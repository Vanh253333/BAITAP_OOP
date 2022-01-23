/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07056;

import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class KhachHang implements Comparable<KhachHang>{
    private String ma, ten, loai;
    private int dau, cuoi;

    public KhachHang(int id, String ten, String loai, int dau, int cuoi) {
        this.ma = "KH" + String.format("%02d", id);
        this.ten = chuanHoa(ten);
        this.loai = loai;
        this.dau = dau;
        this.cuoi = cuoi;
    }
    
    private String chuanHoa(String s){
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder kq = new StringBuilder();
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i < tmp.length(); i++){
                kq.append(Character.toLowerCase(tmp.charAt(i)));
            }
             kq.append(" ");
        }
       return kq.toString().trim();
    }
    
    private int dinhMuc(){
        if(loai.equals("A"))
            return 100;
        else if(loai.equals("B"))
            return 500;
        else 
            return 200;
    }
    
    private long tienTrongDM(){
        int k = cuoi - dau;
        if(k <= dinhMuc())
            return k*450;
        else
            return dinhMuc()*450;
    }
    
    private long tienVuot(){
        int k = cuoi-dau;
        if(k > dinhMuc())
            return (k-dinhMuc())*1000;
        else
            return 0;
    }
    
    private long thue(){
        return (tienVuot()*5)/100;
    }
    
    private Long tong(){
        return tienTrongDM() + tienVuot() + thue();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tienTrongDM() + " " + tienVuot() + " " + thue() + " " + tong();
    }

    @Override
    public int compareTo(KhachHang o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return o.tong().compareTo(tong());
    }
    
}
