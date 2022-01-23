/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07024;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author HP
 */
public class WordSet {
    TreeSet<String> ds = new TreeSet<>();
    public WordSet(String filename) throws IOException{
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNext()){
            ds.add(sc.next().toLowerCase());
        }
    }
    
    public String difference(WordSet x){
        String res = "";
        for(String i: ds){
            if(!x.ds.contains(i))
                res += i + " ";
        }
        return res.trim();
    }
}
