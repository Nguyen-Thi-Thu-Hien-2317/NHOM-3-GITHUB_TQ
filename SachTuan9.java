import java.util.Scanner;

public abstract class SachTuan9 implements IGiaBan, IKiemKe {
    protected String maSach, tieuDe, tacGia;
    protected int namXuatBan, soLuong;
    protected double giaCoBan;

    public SachTuan9() {}

    public SachTuan9(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    public void nhapThongTinChung(Scanner sc) {
        sc.nextLine();
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Nhap tieu de: ");
        tieuDe = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();

        do {
            System.out.print("Nhap nam xuat ban (≤2025, >0): ");
            namXuatBan = sc.nextInt();
        } while (namXuatBan <= 0 || namXuatBan > 2025);

        do {
            System.out.print("Nhap so luong (≥0): ");
            soLuong = sc.nextInt();
        } while (soLuong < 0);

        do {
            System.out.print("Nhap gia co ban (≥0): ");
            giaCoBan = sc.nextDouble();
        } while (giaCoBan < 0);
    }

    public abstract void nhapThongTin(Scanner sc);

    public String getMaSach() { return maSach; }
    public String getTieuDe() { return tieuDe; }
    public String getTacGia() { return tacGia; }
    public double getGiaCoBan() { return giaCoBan; }
    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int sl) { this.soLuong = sl; }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Cap nhat vi tri: " + viTriMoi);
    }

    @Override
    public String toString() {
        return String.format("%-10s | %-20s | %-15s | %4d | %3d | %.2f",
                maSach, tieuDe, tacGia, namXuatBan, soLuong, tinhGiaBan());
    }
}
