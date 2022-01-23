/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04014;

/**
 *
 * @author HP
 */
public class PhanSo {
    private long a, b;

    public PhanSo(long a, long b) {
        this.a = a;
        this.b = b;
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
    
    public void rutGon(){
        long x = uc(a, b);
        a = a/x;
        b = b/x;
    }
    
    public PhanSo tinhC(PhanSo p){
        PhanSo x = new PhanSo((long)Math.pow(a*p.b + b*p.a, 2), (long)Math.pow(b*p.b, 2));
        return x;
    }
    
    public PhanSo tinhD(PhanSo p, PhanSo q){
        PhanSo x = new PhanSo(this.a * p.a * q.a, this.b * p.b * q.b);
        return x;
    }
    

    @Override
    public String toString() {
        return a + "/" + b;
    }
    
    
}
