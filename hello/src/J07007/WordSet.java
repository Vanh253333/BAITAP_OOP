/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07007;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author HP
 */
public class WordSet {
    TreeSet<String> word = new TreeSet<String>();
    public WordSet(String filename) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(filename));
   
        String str = "";
        while(sc.hasNextLine()){
            str += sc.nextLine().toLowerCase() + " ";
        }
        String arrWord[] = str.trim().split("\\s+");
        for(String x: arrWord){
            word.add(x);
        }  
        
       
    }

    @Override
    public String toString() { 
        String res = "";
        for(String x: word){
            res = res + x + "\n";
        }
        return res.trim();
    }   
}
