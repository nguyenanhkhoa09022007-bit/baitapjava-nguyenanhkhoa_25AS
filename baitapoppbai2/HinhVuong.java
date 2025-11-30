package baitapoppbai2;

public class HinhVuong extends HinhChuNhat {
    
    public HinhVuong(String tenHinh, double canh) {
        super(tenHinh, canh, canh);
    }
    
    public HinhVuong(double canh) {
        super("HinhVuong", canh, canh);
    }
    
    
}
