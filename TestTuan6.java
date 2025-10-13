import java.util.ArrayList;
import java.util.Scanner;
public class TestTuan6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        QuanLySach ql = new QuanLySach(); // dùng lớp quản lý sách
        while (true) {
            System.out.println("\n===== NHAP THONG TIN SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("0. Dung nhap");
            System.out.print("Chon loai sach: ");
            int loai = sc.nextInt();
            sc.nextLine(); // bỏ dòng trống
            if (loai == 0) break;
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
            if (loai == 1) 
            { // sách giáo trình
                System.out.print("Mon hoc: ");
                String monHoc = sc.nextLine();
                System.out.print("Cap do: ");
                String capDo = sc.nextLine();
                SachGiaoTrinh sg = new SachGiaoTrinh(maSach, tieuDe, tacGia, namXuatBan, soLuong, monHoc, capDo);
                ql.themSach(sg);
            } 
            else if (loai == 2) 
            { // sách tiểu thuyết
                System.out.print("The loai: ");
                String theLoai = sc.nextLine();
                System.out.print("Co thuoc series khong (true/false): ");
                boolean laSeries = sc.nextBoolean();
                sc.nextLine();
                SachTieuThuyet st = new SachTieuThuyet(maSach, tieuDe, tacGia, namXuatBan, soLuong, theLoai, laSeries);
                ql.themSach(st);
            }
            System.out.print("Ban co muon nhap them khong? (y/n): ");
            String tiepTuc = sc.nextLine();
            if (tiepTuc.equalsIgnoreCase("n")) break;
        }
        System.out.println("\n--- DANH SACH CAC SACH ---");
        ql.hienThiDanhSach();
        sc.close();
    }
}