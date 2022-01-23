/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSachDoanhNghiep;

import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class SinhVien {
    private String maSV, tenSV, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.maSV = ma;
        this.tenSV = chuanHoa(ten);
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

    public String getMaSV(){
        return maSV;
    }

    
    public String getTenSV(){
        return tenSV;
    }
    
    public String getLop(){
        return lop;
    }
    
}
