/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07001;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class SoNguyenToTrong2FileNhiPhan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ds1 = (ArrayList<Integer>)sc1.readObject();
        ArrayList<Integer> ds2 = (ArrayList<Integer>)sc2.readObject();
        int arr1[] = new int[10005];
        int arr2[] = new int[10005];
        
        for(Integer i: ds1){
            if(isPrime(i) && isReverse(String.valueOf(i)))
                arr1[i]++;
        }
        for(Integer i: ds2){
            if(isPrime(i) && isReverse(String.valueOf(i)))
                arr2[i]++;
        }
        
        for(int i = 0; i < 10005; i++){
            if(arr1[i] > 0 || arr2[i] > 0)
                System.out.println(i + " " + arr1[i] + " " + arr2[i]);
        }
    }
    
    public static boolean isPrime(int n){
        if(n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n%i==0)
                return false;
        return true;
    }
    
    public static boolean isReverse(String s){
        StringBuilder tmp = new StringBuilder(s);
        tmp = tmp.reverse();
        return (s.equals(tmp.toString()));
    }
    
}
