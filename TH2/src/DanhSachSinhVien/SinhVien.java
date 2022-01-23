/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSachSinhVien;

import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = chuanHoa(ten);
        this.lop = lop;
        this.email = email;
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
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
    }

    @Override
    public int compareTo(SinhVien o) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.ma.compareTo(o.ma);
    }
    
    
}
