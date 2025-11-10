package JAVA.T5_hdt;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach: ");
        int n = sc.nextInt();
        sc.nextLine();
        Sach[] ds = new Sach[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sach thu " + (i + 1));
            System.out.print("Ma sach: ");
            String maSach = sc.nextLine();
            System.out.print("Tieu de: ");
            String tieuDe = sc.nextLine();
            System.out.print("Tac gia: ");
            String tacGia = sc.nextLine();
            System.out.print("Nam xuat ban: ");
            int namXuatBan = sc.nextInt();
            System.out.print("So luong: ");
            int soLuong = sc.nextInt();
            sc.nextLine();
            ds[i] = new Sach(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        }
        System.out.println("\nDanh sach thong tin sach:");
        for (Sach s : ds) {
            s.hienThiThongTin();
        }
        sc.close();
    }
}
