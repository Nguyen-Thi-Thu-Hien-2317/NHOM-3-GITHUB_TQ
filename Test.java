import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySachlmpl ql = new QuanLySachlmpl();
        int chon = -1;

        do {
            try {
                System.out.println("\n===== MENU QUAN LY SACH =====");
                System.out.println("1. Them sach giao trinh");
                System.out.println("2. Them sach tieu thuyet");
                System.out.println("3. Hien thi danh sach");
                System.out.println("4. Tim sach theo tieu de");
                System.out.println("5. Tim sach theo tac gia");
                System.out.println("6. Sap xep theo gia ban");
                System.out.println("7. Thong ke tong gia tri kho");
                System.out.println("8. Luu file CSV");
                System.out.println("9. Doc file CSV");
                System.out.println("0. Thoat");
                System.out.print("Chon: ");
                chon = sc.nextInt();

                switch (chon) {
                    case 1: {
                        SachGiaoTrinhTuan9 sgt = new SachGiaoTrinhTuan9();
                        sgt.nhapThongTin(sc);
                        ql.themSach(sgt);
                        break;
                    }
                    case 2: {
                        SachTieuThuyetTuan9 stt = new SachTieuThuyetTuan9();
                        stt.nhapThongTin(sc);
                        ql.themSach(stt);
                        break;
                    }
                    case 3: {
                        ql.hienThiDanhSachSach();
                        break;
                    }
                    case 4: {
                        sc.nextLine(); // bỏ ký tự Enter
                        System.out.print("Nhap tieu de can tim: ");
                        String td = sc.nextLine();
                        List<SachTuan9> kq = ql.timSachTheoTieuDe(td);
                        if (kq.isEmpty()) System.out.println("Khong tim thay sach phu hop!");
                        else kq.forEach(System.out::println);
                        break;
                    }
                    case 5: {
                        sc.nextLine();
                        System.out.print("Nhap tac gia can tim: ");
                        String tg = sc.nextLine();
                        List<SachTuan9> kq = ql.timSachTheoTacGia(tg);
                        if (kq.isEmpty()) System.out.println("Khong tim thay sach phu hop!");
                        else kq.forEach(System.out::println);
                        break;
                    }
                    case 6: {
                        ql.sapXepTheoGia();
                        System.out.println(" Da sap xep theo gia ban tang dan!");
                        break;
                    }
                    case 7: {
                        System.out.println("Tong gia tri kho: " + ql.tinhTongGiaTriKho() + " VND");
                        break;
                    }
                    case 8: {
                        sc.nextLine();
                        System.out.print("Nhap ten file de luu (vd: sach.csv): ");
                        ql.luuFile(sc.nextLine());
                        break;
                    }
                    case 9: {
                        sc.nextLine();
                        System.out.print("Nhap ten file de doc (vd: sach.csv): ");
                        ql.docFile(sc.nextLine());
                        break;
                    }
                    case 0: {
                        System.out.println("Tam biet!");
                        break;
                    }
                    default: {
                        System.out.println(" Lua chon khong hop le!");
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println(" Loi: Nhap sai kieu du lieu, vui long thu lai!");
                sc.nextLine(); // don bo nho dem
                chon = -1;
            }
        } while (chon != 0);

        sc.close();
    }
}