/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05067;

/**
 *
 * @author HP
 */
public class MatHang implements Comparable<MatHang>{
    private String ma;
    private int sl;

    public MatHang(String ma, int sl) {
        this.ma = ma;
        this.sl = sl;
    }
    
    private int donGia(){
        if(ma.charAt(0) == 'X')
            return 128000;
        else if(ma.charAt(0) =='D')
            return 11200;
        else
            return 9700;       
    }
    
    private long thue(){
        if(this.tenHang().equals("Trong Nuoc"))
            return 0;
        else{
            if(ma.charAt(0) == 'X')
                return (long) sl*1280*3;
            else if(ma.charAt(0) =='D')
                return (long) sl*56*7;
            else
                return (long) sl*97*2;
        }
    }
    
    private Long thanhTien(){
        return (long)this.donGia() * sl + this.thue();
    }
    
    private String tenHang() {
	char[] a = ma.toCharArray();
	String s = String.valueOf(a, 3, 2);
	if(s.equals("BP")) 
            return "British Petro";
	if(s.equals("ES")) 
            return "Esso";
	if(s.equals("SH")) 
            return "Shell";
	if(s.equals("CA")) 
            return "Castrol";
	if(s.equals("MO")) 
            return "Mobil";
	return "Trong Nuoc";
	}

    @Override
    public String toString() {
        return ma + ' ' + tenHang() + " " + donGia() + " " + thue() + " " + thanhTien();
    }

    @Override
    public int compareTo(MatHang o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return o.thanhTien().compareTo(thanhTien());
    }
    
}
