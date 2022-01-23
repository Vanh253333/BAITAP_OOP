/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05025;

/**
 *
 * @author HP
 */
public class GiangVien implements Comparable<GiangVien>{
    private String ma, hoTen, boMon;

    public GiangVien(int id, String hoTen, String boMon) {
        this.ma = "GV" + String.format("%02d", id);
        this.hoTen = hoTen;
        this.boMon = boMon;
    }
    
    private String ten(){
        String[] ds = hoTen.split(" ");
        return ds[ds.length-1];
    }
    
    private String bm(){
        StringBuilder res = new StringBuilder();
        String[] ds = boMon.split(" ");
        for(int i = 0; i < ds.length; i++){
            res.append(Character.toUpperCase(ds[i].charAt(0)));
        }
        return res.toString();
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + bm();
    }

    @Override
    public int compareTo(GiangVien o) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(ten().compareTo(o.ten()) != 0)
            return ten().compareTo(o.ten());
        else
            return ma.compareTo(o.ma);
    }
    
    
}
