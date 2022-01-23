/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th2;

import java.io.*;
import java.util.*;

/**
 *
 * @author HP
 */
public class CapSoNguyenToTrongFile {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> a=(ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> b=(ArrayList<Integer>) in2.readObject();

        int arr1[]=new int[1000006];
        int arr2[]=new int[1000006];
        for(Integer p:a){
            if(check(p)==1)
            arr1[p]++;
        }
        for(Integer p:b){
            if(check(p)==1)
            arr2[p]++;
        }
        for(int i=0;i<=5000000;i++){
            if(arr1[i]>0&&arr2[1000000-i]>0){
                System.out.println(i+" "+(1000000-i));
            }
        }
    }
    
    public static int check(int n){
        if(n<2) return 0;
        for(int i=2;i<=Math.sqrt(n);i++) 
        if(n%i==0) return 0;
        return 1;
    }
}
