package baitapoppbai2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hinh> ds = new ArrayList<>();

        ds.add(new HinhTron(5));
        ds.add(new HinhChuNhat(4, 6));
        ds.add(new HinhVuong(7));

        double tongDienTich = 0;
        for (Hinh h : ds) {
            h.xuatthongtin();
            tongDienTich += h.tinhDienTich();
        }

        System.out.println("Tong dien tich cac hinh la: " + tongDienTich);
    }
}
