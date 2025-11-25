import java.util.ArrayList;
import java.util.Scanner;
public class QuanLySachTuan6 {
    private ArrayList<SachTuan6> danhSach = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    // === Thêm sách ===
    public void themSach() {
        System.out.println("1. Sach Giao Trinh");
        System.out.println("2. Sach Tieu Thuyet");
        System.out.print("Chon loai sach: ");
        String loai = sc.nextLine();
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
        if (loai.equals("1")) {
            System.out.print("Nhap mon hoc: ");
            String mh = sc.nextLine();
            System.out.print("Nhap cap do: ");
            String cd = sc.nextLine();
            danhSach.add(new SachGiaoTrinhTuan6(ma, td, tg, nam, sl, mh, cd));
        } else if (loai.equals("2")) {
            System.out.print("Nhap the loai: ");
            String tl = sc.nextLine();
            System.out.print("Sach thuoc series? (true/false): ");
            boolean series = Boolean.parseBoolean(sc.nextLine());
            danhSach.add(new SachTieuThuyetTuan6(ma, td, tg, nam, sl, tl, series));
        } else {
            System.out.println("Loai sach khong hop le!");
        }
    }
    // === Hiển thị ===
    public void hienThiTatCa() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong!");
        } else {
            for (SachTuan6 s : danhSach) {
                s.hienThiThongTin();
            }
        }
    }
    // === Tìm kiếm theo mã ===
    public SachTuan6 timKiemTheoMa(String ma) {
        for (SachTuan6 s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                return s;
            }
        }
        return null;
    }
    // === Xóa sách ===
    public void xoaSach() {
        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();
        SachTuan6 s = timKiemTheoMa(ma);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("Da xoa sach co ma: " + ma);
        } else {
            System.out.println("Khong tim thay sach co ma: " + ma);
        }
    }
    // === Cập nhật sách ===
    public void capNhatSach() {
        System.out.print("Nhap ma sach can cap nhat: ");
        String ma = sc.nextLine();
        SachTuan6 s = timKiemTheoMa(ma);
        if (s != null) {
            System.out.print("Nhap tieu de moi: ");
            s.setTieuDe(sc.nextLine());
            System.out.print("Nhap tac gia moi: ");
            s.setTacGia(sc.nextLine());
            System.out.print("Nhap nam xuat ban moi: ");
            s.setNamXuatBan(Integer.parseInt(sc.nextLine()));
            System.out.print("Nhap so luong moi: ");
            s.setSoLuong(Integer.parseInt(sc.nextLine()));
            System.out.println("Da cap nhat thong tin sach!");
        } else {
            System.out.println("Khong tim thay sach de cap nhat!");
        }
    }
}
