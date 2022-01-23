/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05048;

/**
 *
 * @author HP
 */
public class Goods implements Comparable<Goods>{
    private String ma;
    private int slNhap;

    public Goods(String ma, int slNhap) {
        this.ma = ma;
        this.slNhap = slNhap;
    }
    
    private int slXuat(){
        if(ma.charAt(0) == 'A')
            return (int)Math.round((slNhap * 60)/100.0);
        else
            return (int)Math.round((slNhap * 70)/100.0);
    }
    
    private long donGia(){
        if(ma.charAt(ma.length()-1) == 'Y')
            return 110000;
        else
            return 135000;
    }
    
    private long tien(){
        return slXuat() * donGia();
    }
    
    private Long thue(){
        int k = ma.length()-1;
        int tmp = 0;
        if(ma.charAt(0) == 'A' && ma.charAt(k) == 'Y')
            tmp = 8;
        else if(ma.charAt(0) == 'A' && ma.charAt(k) == 'N')
            tmp = 11;
        else if(ma.charAt(0) == 'B' && ma.charAt(k) == 'Y')
            tmp = 17;
        else if(ma.charAt(0) == 'B' && ma.charAt(k) == 'N')
            tmp = 22;
        return (tien() * tmp)/100;
    }

    @Override
    public String toString() {
        return ma + " " + slNhap + " " + slXuat() + " " + donGia() + " " + tien() + " " + thue();
    }
    
    public String getMa(){
        return "" + ma.charAt(0);
    }

    @Override
    public int compareTo(Goods o) {
        return o.thue().compareTo(this.thue());
    }
    
    
}
