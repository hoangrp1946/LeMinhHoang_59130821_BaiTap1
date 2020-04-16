/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Pc
 */
public class BaiTap1Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        LopHoc lh = new LopHoc();
        HocSinh hs1 = new HocSinh("59CNTT1", "Thiết kế Web", "Mai Kim Trọng", 20, "Ninh Hòa", "0991234568");
        HocSinh hs2 = new HocSinh("59CNTT3", "Tin học cơ sở", "Phạm Triệu Viễn", 21, "Bình Thuận", "093216547");
        GiaoVien gv1 = new GiaoVien("Tin học cơ sở", "Công nghệ phần mềm", "Đoàn Vũ Thịnh", 34, "Nha Trang", "0902345678");
        GiaoVien gv2 = new GiaoVien("Kỹ thuật đồ họa", "Công nghệ phần mềm", "Nguyễn Đình Hoàng Sơn", 38, "Nha Trang", "0981224589");       
        lh.themHocSinh(hs1);
        lh.themHocSinh(hs2);
        lh.themGVGD(gv1);
        lh.themGVGD(gv2);       
        lh.inDSHS();
        lh.inDSGVGD();
    }
    
}
