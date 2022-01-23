/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07001;

import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author HP
 */
public class TinhTong {
    public static void main(String[] args) {
        long sum = 0;
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNext()){
                String s = sc.next();
                try{
                    int k = Integer.parseInt(s);
                    sum += k;
                }catch(NumberFormatException e){
                    continue;
                }
            }
        }catch(Exception e){
        }
        System.out.println(sum);

    }
}
