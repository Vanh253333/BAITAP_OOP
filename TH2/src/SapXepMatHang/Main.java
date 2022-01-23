/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SapXepMatHang;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        ArrayList<MatHang> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            ds.add(new MatHang(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
            
        }
        Collections.sort(ds);
        for(MatHang a: ds){
            System.out.println(a);
        }
    }
}
