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

public class LopHoc {
    List<HocSinh> dsHocSinh = new ArrayList<>();
    List<GiaoVien> dsGVGD = new ArrayList<>();
    
    public int themHocSinh(HocSinh hocSinh) {
        dsHocSinh.add(hocSinh);
        return 0;
    }
    
    public int themGVGD(GiaoVien giaoVien) {
        dsGVGD.add(giaoVien);
        return 0;
    }
    public int inDSHS() {
        int s = 0;
        System.out.println("Danh sách học sinh: ");
        for(HocSinh hocSinh: dsHocSinh) {
            System.out.println(hocSinh.hienThiTT());
            s = s + 1;
        }
        return s;
    }    
    public int inDSGVGD() {
        int s = 0;
        System.out.println("Danh sách giáo viên giảng dạy: ");
        for(GiaoVien giaoVien: dsGVGD) {
            System.out.println(giaoVien.hienThiTT());
            s = s + 1;
        }
        return s;
    }
}
