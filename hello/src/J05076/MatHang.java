/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05076;

/**
 *
 * @author HP
 */
public class MatHang {
    private String ma, ten, xl;

    public MatHang(String ma, String ten, String xl) {
        this.ma = ma;
        this.ten = ten;
        this.xl = xl;
    }
    
    public String getMa(){
        return ma;
    }
    
    public String getTen(){
        return ten;
    }
    
    public int laiSuat() {
	if(xl.equals("A"))
            return 8;
	else if(xl.equals("B"))
            return 5;
	return 2;
    }
}
