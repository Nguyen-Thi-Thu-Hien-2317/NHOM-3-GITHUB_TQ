import java.util.Scanner;

public class SachGiaoTrinhTuan8 extends SachTuan8 {
    private String monHoc;
    private String capHoc;

    public SachGiaoTrinhTuan8() {
        super();
    }

    public SachGiaoTrinhTuan8(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capHoc) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capHoc = capHoc;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getCapHoc() {
        return capHoc;
    }

    public void setCapHoc(String capHoc) {
        this.capHoc = capHoc;
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - namXuatBan; // Giá tăng nhẹ theo năm xuất bản
        double phuPhi = soNam * 5000;
        return giaCoBan + phuPhi;
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("📦 Đã chuyển sách \"" + tieuDe + "\" đến khu vực: " + viTriMoi);
    }
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTinChung(sc);
        System.out.print("Nhap mon hoc: ");
        monHoc = sc.nextLine();
        System.out.print("Nhap cap hoc: ");
        capHoc = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Mon hoc: " + monHoc +
               ", Cap hoc: " + capHoc +
               ", Gia ban: " + tinhGiaBan() + " VND";
    }
}