/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Pc
 */
public class QLDS implements IQLDS{
    private List<CaNhan> dsCaNhan = new ArrayList<>();

    @Override
    public int themCaNhan(CaNhan caNhan) {
        dsCaNhan.add(caNhan);
        return 0;
    }

    @Override
    public int xoa(String ten) {
        for(CaNhan caNhan: dsCaNhan) {
            if(caNhan.getHoTen().equals(ten)) {
                dsCaNhan.remove(caNhan);
            }
        }
        return 0;
    }

    @Override
    public void inDS() {
        for(CaNhan caNhan: dsCaNhan) {
           caNhan.hienThiTT();
       }
    }       
}
