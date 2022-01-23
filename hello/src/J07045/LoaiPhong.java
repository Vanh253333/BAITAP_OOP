/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07045;

/**
 *
 * @author HP
 */
public class LoaiPhong implements Comparable<LoaiPhong>{
    private String duLieu;
    public LoaiPhong(String s){
	duLieu = s;
    }
    
    private String loaiPhong(){
	String[] s = duLieu.split(" ");
	return s[1];
    }
    
    @Override
    public String toString() {
	return duLieu;
    }
    
    @Override
    public int compareTo(LoaiPhong o) {
	return loaiPhong().compareTo(o.loaiPhong());
    }
    
}
