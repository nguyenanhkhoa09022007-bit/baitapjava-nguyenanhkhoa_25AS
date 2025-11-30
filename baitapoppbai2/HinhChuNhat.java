package baitapoppbai2;

public class HinhChuNhat extends Hinh {
    private double chieudai;
    private double chieurong;



public HinhChuNhat(String tenHinh, double chieudai, double chieurong){
    super(tenHinh);
    this.chieudai = chieudai;
    this.chieurong = chieurong;
    }

    public HinhChuNhat(double chieudai, double chieurong){
        super("HinhChuNhat");
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
@Override
public double tinhChuVi() {
    return 2 * (chieudai + chieurong);
}

@Override
public double tinhDienTich() {
    return chieudai * chieurong;
}
}

