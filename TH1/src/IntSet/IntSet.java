/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntSet;

import java.util.*;

/**
 *
 * @author HP
 */
public class IntSet {
    private int a[];

    public IntSet(int a[]) {
        this.a = a;
    }
    
    public IntSet intersection(IntSet b){
        TreeSet<Integer> tmp = new TreeSet<Integer>();
        TreeSet<Integer> ds = new TreeSet<Integer>();
        for(int i = 0; i < a.length; i++){
            tmp.add(a[i]);
        }
        for(int i = 0; i < b.a.length; i++){
            if(tmp.contains(b.a[i]))
                ds.add(b.a[i]);
        }
        int res[] = new int[ds.size()], k = 0;
        for(Integer i: ds){
            res[k++] = i;
        }
        return new IntSet(res);
    }

    @Override
    public String toString() {
        String res = "";
        for(int i = 0; i < a.length; i++)
            res += Integer.toString(a[i]) + " ";
        return res.trim();
    }
    
    
}
