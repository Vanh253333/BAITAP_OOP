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
public class SoNguyenToTrongFileNhiPhan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) sc.readObject();
        int a[] = new int[100005];
        for(Integer i: arr){
            if(isPrime(i)){
                a[i]++;
            }
        }
        
        for(int i = 0; i < 100005; i++){
            if(a[i] > 0)
                System.out.println(i + " " + a[i]);
        }
    }
    
    private static boolean isPrime(int n){
        if(n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
