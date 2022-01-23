/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07001;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ThongKeTuFileVB {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int t = Integer.parseInt(sc.nextLine());
        String s = "";
        while(t-- > 0){
            s+= sc.nextLine().toLowerCase() + " ";
        }
        String list[] = s.replaceAll("\\W+", " ").split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < list.length; i++){
            if(map.containsKey(list[i]))
                map.replace(list[i], map.get(list[i])+1);
            else
                map.put(list[i], 1);
        }


    }
}
