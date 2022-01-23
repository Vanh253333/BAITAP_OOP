/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pair;

/**
 *
 * @author HP
 */
public class Pair<K extends Integer, V extends Integer> {
    private K a;
    private V b;

    public Pair(K a, V b) {
        this.a = a;
        this.b = b;
    }

    
    
    private boolean check(int n){
        if(n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    
    public boolean isPrime(){
        if(check(a) && check(b))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return  a + " " + b;
    }
    
    
}
