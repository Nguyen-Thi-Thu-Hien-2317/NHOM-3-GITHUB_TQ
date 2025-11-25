import java.util.ArrayList;
import java.util.Scanner;

public class TestTuan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SachTuan5> danhSach = new ArrayList<>();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi tat ca sach");
            System.out.println("3. Thoat");
            System.out.print("Chon: ");
            String chon = sc.nextLine();

            if (chon.equals("1")) {
                // Nhap thong tin sach
                System.out.print("Nhap ma sach: ");
                String ma = sc.nextLine();

                System.out.print("Nhap tieu de: ");
                String td = sc.nextLine();

                System.out.print("Nhap tac gia: ");
                String tg = sc.nextLine();

                System.out.print("Nhap nam xuat ban: ");
                int nam = Integer.parseInt(sc.nextLine());

                System.out.print("Nhap so luong: ");
                int sl = Integer.parseInt(sc.nextLine());

                // Tao doi tuong va them vao danh sach
                SachTuan5 s = new SachTuan5(ma, td, tg, nam, sl);
                danhSach.add(s);
                System.out.println("Da them sach thanh cong!");

            } else if (chon.equals("2")) {
                if (danhSach.isEmpty()) {
                    System.out.println("Danh sach sach rong!");
                } else {
                    System.out.println("\n===== DANH SACH SACH =====");
                    for (SachTuan5 s : danhSach) {
                        s.hienThiThongTin();
                    }
                }

            } else if (chon.equals("3")) {
                System.out.println("Thoat chuong trinh...");
                break;

            } else {
                System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }

        sc.close();
    }
}
