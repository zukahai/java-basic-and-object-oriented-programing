package models;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang; 

    public SachGiaoKhoa() {
        super();
        this.tinhTrang = "mới";
    }

    public SachGiaoKhoa(String maSach, String ngayNhap, int donGia, int soLuong, String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong);
        this.tinhTrang = tinhTrang;
    }

    public double tinhThanhTien() {
        if (tinhTrang.equalsIgnoreCase("mới")) {
            return getSoLuong() * getDonGia();
        } else if (tinhTrang.equalsIgnoreCase("cũ")) {
            return getSoLuong() * getDonGia() * 0.5;
        } else {
            return 0;
        }
    }

    public void input() {
        super.input();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tình trạng sách (mới/cũ): ");
        this.tinhTrang = sc.nextLine();
        
    }

    @Override
    public String toString() {
        return super.toString() + ", tinhTrang=" + tinhTrang + ", thanhTien=" + tinhThanhTien();
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
