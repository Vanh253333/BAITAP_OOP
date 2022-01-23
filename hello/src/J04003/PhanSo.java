/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04003;

/**
 *
 * @author HP
 */
public class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public void rutGon(){
        long x = uc(tu, mau);
        tu = tu/x;
        mau = mau/x;
    }
    
    public PhanSo cong(PhanSo p){
        PhanSo a = new PhanSo(tu*p.mau + mau*p.tu, mau*p.mau);
        return a;
    }
    
    private long uc(long a, long b){
        long t;
        while(b > 0){
            t = a%b;
            a = b;
            b = t;
        }
        return a;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
    
}
