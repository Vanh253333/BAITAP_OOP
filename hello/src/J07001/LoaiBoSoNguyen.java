/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07001;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author HP
 */
public class LoaiBoSoNguyen {
    public static void main(String[] args) throws IOException {
        ArrayList<String> ds = new ArrayList<>();
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNext()){
                String s = sc.next();
                try{
                    int k = Integer.parseInt(s);
                }catch(NumberFormatException e){
                    ds.add(s);
                }
            }
        }catch(Exception e){
            
        }
        Collections.sort(ds);
        for(String i : ds){
            System.out.print(i + " ");
        }
    }
}
