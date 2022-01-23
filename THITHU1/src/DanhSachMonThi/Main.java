/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSachMonThi;

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
        Scanner sc2 = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc2.nextLine());
        ArrayList<MonHoc> ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new MonHoc(sc2.nextLine(), sc2.nextLine(), sc2.nextLine()));
        }
        Collections.sort(ds);
        for(MonHoc a: ds){
            System.out.println(a);
        }
    }
}
