package models;

import java.util.Scanner;
import java.util.Vector;

public class SachMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<SachGiaoKhoa> danhSachSach = new Vector<>();

        System.out.print("Nhập số lượng sách giáo khoa: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sách giáo khoa thứ " + (i + 1) + ":");
            SachGiaoKhoa sach = new SachGiaoKhoa();
            sach.input();
            danhSachSach.add(sach);
        }

        if (!danhSachSach.isEmpty()) {
            SachGiaoKhoa sachMin = danhSachSach.get(0);
            for (SachGiaoKhoa sach : danhSachSach) {
                if (sach.tinhThanhTien() < sachMin.tinhThanhTien()) {
                    sachMin = sach;
                }
            }
            System.out.println("Sách giáo khoa có thành tiền nhỏ nhất: ");
            System.out.println(sachMin);
        } else {
            System.out.println("Danh sách sách giáo khoa trống.");
        }

        System.out.println("Các sách giáo khoa có chứa chữ 'Văn học': ");
        for (SachGiaoKhoa sach : danhSachSach) {
            if (sach.getMaSach().toLowerCase().contains("văn học")) {
                System.out.println(sach);
            }
        }
    }
}
