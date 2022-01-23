/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07014;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author HP
 */
public class WordSet {
    private TreeSet<String> ds = new TreeSet<>();
    public WordSet(String s){      
        String tmp[] = s.split("\\s+");
        for(String i: tmp){
            ds.add(i.toLowerCase());
        }
    }
    
    public String union(WordSet x){
        TreeSet<String> dsUnion = new TreeSet<>();
        for(String i: this.ds) dsUnion.add(i);
        for(String i: x.ds) dsUnion.add(i);
        String res = "";
        for(String i: dsUnion){
            res += i + " ";
        }
        return res;
    }
    
    public String intersection(WordSet x){
        TreeSet<String> dsInter = new TreeSet<>();
        for(String i: this.ds){
            if(x.ds.contains(i))
                dsInter.add(i);
        }
        String res = "";
        for(String i: dsInter){
            res += i + " ";
        }
        return res;
    }
}
