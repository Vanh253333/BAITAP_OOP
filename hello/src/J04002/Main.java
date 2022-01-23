/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04002;

/**
 *
 * @author HP
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        String color = sc.next();
        if(width <= 0 || height <= 0){
            System.out.println("INVALID");
        }else{
            Rectange a = new Rectange((double)width, (double)height, color);
                    System.out.println(a);
        }
    }
    
}
