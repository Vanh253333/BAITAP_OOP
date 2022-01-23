/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SapXepLichThi;

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
    public static ArrayList<CaThi> dsCT = new ArrayList<>();
    public static ArrayList<MonHoc> dsMH = new ArrayList<>();
    public static ArrayList<LichThi> ds = new ArrayList<>();
    
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("CATHI.in"));        
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            dsCT.add(new CaThi(i, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        Scanner sc2 = new Scanner(new File("MONTHI.in"));
        int m = Integer.parseInt(sc2.nextLine());       
        while(m-- > 0){
            dsMH.add(new MonHoc(sc2.nextLine(), sc2.nextLine(), sc2.nextLine()));
        }

        Scanner sc3 = new Scanner(new File("LICHTHI.in"));
        int n = Integer.parseInt(sc3.nextLine());
        while(n-- > 0){
            String s[] = sc3.nextLine().split(" ");
            ds.add(new LichThi(timCT(s[0]), timMH(s[1]), s[2], s[3]));
        }
        Collections.sort(ds);
        
        for(LichThi a: ds){
            System.out.println(a);
        }                  
    }
    
    public static MonHoc timMH(String s){
        for(MonHoc a: dsMH){
            if(a.getMaMH().equals(s))
                return a;
        }
        return null;
    }
    
    public static CaThi timCT(String s){
        for(CaThi a: dsCT){
            if(a.getMaCa().equals(s))
                return a;
        }
        return null;
    }
}
