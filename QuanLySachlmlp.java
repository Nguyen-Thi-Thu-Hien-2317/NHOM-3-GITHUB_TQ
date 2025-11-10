import java.util.ArrayList;

public class QuanLySachlmlp implements IQuanLySach {
    private ArrayList<SachTuan8> danhSachSach;

    public QuanLySachlmlp() {
        danhSachSach = new ArrayList<>();
    }

    @Override
    public void themSach(SachTuan8 s) {
        danhSachSach.add(s);
        System.out.println(" Da them sach thanh cong!");
    }

    @Override
    public SachTuan8 timKiemSach(String maSach) {
        for (SachTuan8 s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void xoaSachTheoMa(String maSach) {
        SachTuan8 sachCanXoa = timKiemSach(maSach);
        if (sachCanXoa != null) {
            danhSachSach.remove(sachCanXoa);
            System.out.println(" Da xoa sach co ma: " + maSach);
        } else {
            System.out.println(" Khong tim thay sach co ma: " + maSach);
        }
    }

    @Override
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        SachTuan8 sach = timKiemSach(maSach);
        if (sach != null) {
            sach.setSoLuong(soLuongMoi);
            System.out.println(" Da cap nhat so luong sach co ma " + maSach + " thanh: " + soLuongMoi);
        } else {
            System.out.println(" Khong tim thay sach co ma: " + maSach);
        }
    }

    @Override
    public void hienThiDanhSachSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println(" Danh sach sach hien dang trong!");
            return;
        }
        System.out.println("\n===== DANH SACH SACH =====");
        for (SachTuan8 s : danhSachSach) {
            System.out.println(s.toString());
            System.out.println("-----------------------------");
        }
    }
}