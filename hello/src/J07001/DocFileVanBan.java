/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07001;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DocFileVanBan {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("Khong tim thay file");
        }
    }
}
