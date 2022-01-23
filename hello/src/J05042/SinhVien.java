/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05042;

/**
 *
 * @author HP
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ten;
    private Integer ac;
    private Long sub;

    public SinhVien(String ten, Integer ac, Long sub) {
        this.ten = ten;
        this.ac = ac;
        this.sub = sub;
    }

    @Override
    public int compareTo(SinhVien o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int k = o.ac.compareTo(this.ac);
        if(k != 0)
            return k;
        else{
            int p = this.sub.compareTo(o.sub);
            if(p!= 0)
                return p;
            else
                return this.ten.compareTo(o.ten);
        }
    }

    @Override
    public String toString() {
        return ten + " " + ac + " " + sub;
    }
    
    
}
