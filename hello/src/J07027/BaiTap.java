/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07027;

/**
 *
 * @author HP
 */
public class BaiTap {
    private int maBT;
    private String tenBT;

    public BaiTap(int maBT, String tenBT) {
        this.maBT = maBT;
        this.tenBT = tenBT;
    }
    
    public int getMaBT(){
        return maBT;
    }
    
    public String getTenBT(){
        return tenBT;
    }
}
