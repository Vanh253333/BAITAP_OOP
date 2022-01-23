/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05026;

/**
 *
 * @author HP
 */
public class GiangVien {
      private String ma, hoTen, boMon;

    public GiangVien(int id, String hoTen, String boMon) {
        this.ma = "GV" + String.format("%02d", id);
        this.hoTen = hoTen;
        this.boMon = boMon;
    }
   
    public String bm(){
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
}
