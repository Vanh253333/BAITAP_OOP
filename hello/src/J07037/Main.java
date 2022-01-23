/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07037;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc2 = new Scanner(new File("DN.in"));
        ArrayList<DoanhNghiep> ds2 = new ArrayList<>();
        int n = Integer.parseInt(sc2.nextLine());       
        while(n-- > 0){
            ds2.add(new DoanhNghiep(sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine())));
        }
        Collections.sort(ds2);
        for(DoanhNghiep a: ds2){
            System.out.println(a);
        }
                
    }
}
