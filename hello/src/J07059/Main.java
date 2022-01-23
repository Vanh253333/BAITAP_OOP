/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07059;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        ArrayList<CaThi> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            ds.add(new CaThi(i, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ds);
        for(CaThi a: ds){
            System.out.println(a);
        }
    }
}
