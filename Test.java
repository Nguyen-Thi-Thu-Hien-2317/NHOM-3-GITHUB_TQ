import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IQuanLySach ql = new QuanLySachlmpl();

        System.out.println("=== NHAP THONG TIN SACH GIAO TRINH ===");
        SachGiaoTrinhTuan8 sgk = new SachGiaoTrinhTuan8();
        sgk.nhapThongTin(sc);
        ql.themSach(sgk);

        System.out.println("\n=== NHAP THONG TIN SACH TIEU THUYET ===");
        SachTieuThuyetTuan8 stt = new SachTieuThuyetTuan8();
        stt.nhapThongTin(sc);
        ql.themSach(stt);

        System.out.println("\n=== DANH SACH SACH ===");
        ql.hienThiDanhSachSach();

        // Thu nghiem giao dien IKiemKe
        IKiemKe kiemKe = sgk;
        System.out.print("\nNhap so luong toi thieu can kiem tra: ");
        int soLuongToiThieu = Integer.parseInt(sc.nextLine());
        System.out.println("Kiem tra ton kho >= " + soLuongToiThieu + ": " + kiemKe.kiemTraTonKho(soLuongToiThieu));
        kiemKe.capNhatViTri("Kho A1 - Ke 5");

        // Thu nghiem cap nhat so luong va xoa sach
        System.out.print("\nNhap ma sach muon cap nhat so luong: ");
        String maCapNhat = sc.nextLine();
        System.out.print("Nhap so luong moi: ");
        int soLuongMoi = Integer.parseInt(sc.nextLine());
        ql.capNhatSoLuong(maCapNhat, soLuongMoi);

        System.out.print("\nNhap ma sach muon xoa: ");
        String maXoa = sc.nextLine();
        ql.xoaSachTheoMa(maXoa);

        System.out.println("\n=== DANH SACH SAU KHI CAP NHAT ===");
        ql.hienThiDanhSachSach();

        sc.close();
    }
}