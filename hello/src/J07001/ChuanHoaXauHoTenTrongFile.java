/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07001;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.nextLine();
        while(!s.equals("END")){
            System.out.println(chuanHoa(s));
            s = sc.nextLine();
        }
    }
    
    public static String chuanHoa(String s){
        StringBuilder res = new StringBuilder();
        StringTokenizer str = new StringTokenizer(s);
        while(str.hasMoreTokens()){
            String tmp = str.nextToken();
            res.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i < tmp.length(); i++){
                res.append(Character.toLowerCase(tmp.charAt(i)));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
}
