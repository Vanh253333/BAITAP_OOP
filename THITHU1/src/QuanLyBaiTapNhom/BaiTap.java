/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBaiTapNhom;

/**
 *
 * @author HP
 */
public class BaiTap {
    private String maBT, tenBT;

    public BaiTap(String maBT, String tenBT) {
        this.maBT = maBT;
        this.tenBT = tenBT;
    }

    @Override
    public String toString() {
        return maBT + " " + tenBT;
    }
    
    public String getMaBT(){
        return maBT;
    }
}
