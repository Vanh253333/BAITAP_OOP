/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04818;

/**
 *
 * @author HP
 */
public class SoPhuc {
    private int a, b;

    public SoPhuc(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public SoPhuc cong(SoPhuc a){
        SoPhuc x = new SoPhuc(this.a + a.a, this.b + a.b);
        return x;
    }
    
    public SoPhuc nhan(SoPhuc o){
        int x = this.a*o.a -this.b*o.b;
        int y = this.a*o.b + this.b*o.a;
        return new SoPhuc(x, y);
    }

    @Override
    public String toString() {
        if(b < 0)
            return a + " - " + Math.abs(b) + "i";
        else
            return a + " + " + Math.abs(b) + "i";
    }  
}
