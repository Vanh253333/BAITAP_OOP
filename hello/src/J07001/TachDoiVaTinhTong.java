/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07001;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TachDoiVaTinhTong {
    public static void main(String[] args) throws FileNotFoundException {
	Scanner sc = new Scanner(new File("DATA.in"));
	String s = sc.next();
	while(s.length()!=1) {
            BigInteger a, b;
            if(s.length()%2==0) {
		a = new BigInteger(String.valueOf(s.toCharArray(), 0, s.length()/2));
		b = new BigInteger(String.valueOf(s.toCharArray(), s.length()/2, s.length()/2));
            }
            else {
		a = new BigInteger(String.valueOf(s.toCharArray(), 0, s.length()/2));
		b = new BigInteger(String.valueOf(s.toCharArray(), s.length()/2, s.length()/2+1));
            }
            a = a.add(b);
            s = a.toString();
            System.out.println(s);
	}
    }
}
