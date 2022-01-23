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
public class SoKhacNhauTrongFile_3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>)sc.readObject();
        int a[] = new int[1005];
        for(Integer i: ds){
            a[i]++;
        }
        for(int i = 0; i < 1005; i++){
            if(a[i] > 0)
                System.out.println(i + " " + a[i]);
        }
    }
}
