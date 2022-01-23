/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07001;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


/**
 *
 * @author HP
 */
public class SoKhacNhauTrongFile_2 {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        int a[] = new int[1000000];
        for(int i = 0; i < 100000; i++){
            a[in.readInt()]++;
        }        
        for(int i = 0; i < 1000; i++){
            if(a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
