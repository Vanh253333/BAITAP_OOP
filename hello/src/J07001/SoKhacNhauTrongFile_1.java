/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07001;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SoKhacNhauTrongFile_1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int a[] = new int[1000000];
        while(sc.hasNextInt()){
            a[sc.nextInt()]++;
        }
        for(int i = 0; i <= 1000; i++){
            if(a[i] > 0){
                System.out.println(i+ " " + a[i]);
            }
        }
    }
          
}
