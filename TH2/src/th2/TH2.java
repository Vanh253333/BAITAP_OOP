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
public class TH2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        
        ArrayList<Integer> a = (ArrayList<Integer>)sc1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>)sc2.readObject();
        
        int arr1[] = new int[1000005];
        int arr2[] = new int[1000005];
        
        for(Integer x: a){
            if(isPrime(x))
                arr1[x]++;
        }
        
        for(Integer x: b){
            if(isPrime(x))
                arr2[x]++;
        }
        
        for(int i = 0; i <= 5000000; i++){
            if(arr1[i] > 0 && arr2[1000000-i] > 0){
                System.out.println(i+ " " + (1000000-i));
            }
        }
        
    }
    
    public static boolean isPrime(int n){
        if(n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
