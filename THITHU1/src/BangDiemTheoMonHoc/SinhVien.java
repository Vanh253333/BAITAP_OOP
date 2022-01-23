/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangDiemTheoMonHoc;

import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class SinhVien {
    private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = chuanHoa(ten);
        this.lop = lop;
        this.email = email;
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

    public String getMaSV(){
        return ma;
    }
    
    public String getLop(){
        return lop;
    }
    
    @Override
    public String toString() {
        return ma + " " + ten;
    }
    
    
    
}
