package baitapoppbai2;

public abstract class Hinh implements IHinhHoc {
    private String tenHinh;


    public Hinh(String tenHinh){
        this.tenHinh = tenHinh;
        }

    public String gettenHinh(){
        return tenHinh;
    }

    public abstract double tinhChuVi();

    public abstract double tinhDienTich();


    public void xuatthongtin(){
       System.out.println("Hinh: " + gettenHinh());
       System.out.println("Chu vi: " + tinhChuVi());
       System.out.println("Dien tich: " + tinhDienTich());
    }
}
