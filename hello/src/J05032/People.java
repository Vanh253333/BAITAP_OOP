/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05032;

/**
 *
 * @author HP
 */
public class People implements Comparable<People>{
    private String ten, ns;

    public People(String ten, String ns){
        this.ten = ten;
        this.ns = ns;
    }

    @Override
    public int compareTo(People o) {
        String s1[] = this.ns.split("/");
        String s2[] = o.ns.split("/");
        if(s1[2].equals(s2[2])){
            if(s1[1].equals(s2[1]))
            return s2[0].compareTo(s1[0]);
            return s2[1].compareTo(s1[1]);
        }
        return s2[2].compareTo(s1[2]);
    }

    @Override
    public String toString() {
        return ten;
    }   
}
