package baitapoppbai2;

public class HinhTron extends Hinh {
    private double bankinh;



public HinhTron(String tenHinh , double bankinh){
    super(tenHinh);
    this.bankinh = bankinh;

}

    public HinhTron(double bankinh){
        super("HinhTron");
        this.bankinh = bankinh;
    }
@Override
public double tinhChuVi(){
    return 2 * Math.PI * bankinh;
}
@Override
public double tinhDienTich(){
    return Math.PI * bankinh * bankinh;
} 
}

