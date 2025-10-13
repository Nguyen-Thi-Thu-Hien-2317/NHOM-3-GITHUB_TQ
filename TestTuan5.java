import java.util.ArrayList;
import java.util.Scanner;
public class TestTuan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SachTuan5> danhSach = new ArrayList<>();
        while (true) {
            System.out.println("Nhap thong tin sach moi:");
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
            sc.nextLine(); // xu ly ky tu xuong dong
            SachTuan5 s = new SachTuan5(maSach, tieuDe, tacGia, namXuatBan, soLuong);
            danhSach.add(s);
            System.out.print("Ban co muon nhap tiep khong? (y/n): ");
            String tiepTuc = sc.nextLine();
            if (tiepTuc.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println("\n--- Danh sach cac sach trong thu vien ---");
        for (SachTuan5 s : danhSach) {
            s.hienThiThongTin();
        }
        sc.close();
    }
}