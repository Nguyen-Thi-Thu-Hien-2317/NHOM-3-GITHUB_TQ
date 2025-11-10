import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng quản lý sách
        QuanLySach qls = new QuanLySach();
        Scanner sc = new Scanner(System.in);
        String chon;

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi tat ca sach");
            System.out.println("3. Xoa sach theo ma"); // Them chuc nang Xoa
            System.out.println("4. Cap nhat sach theo ma"); // Them chuc nang Cap nhat
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextLine();

            if (chon.equals("1")) {
                qls.themSach(); // Gọi phương thức themSach() từ lớp QuanLySach
                System.out.println("Da them sach thanh cong!");
            } else if (chon.equals("2")) {
                qls.hienThiTatCa(); // Gọi phương thức hienThiTatCa()
            } else if (chon.equals("3")) {
                qls.xoaSach(); // Gọi phương thức xoaSach()
            } else if (chon.equals("4")) {
                qls.capNhatSach(); // Gọi phương thức capNhatSach()
            } else if (chon.equals("0")) {
                System.out.println("Thoat chuong trinh...");
                break;
            } else {
                System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
        sc.close();
    }
}