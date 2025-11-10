import java.util.ArrayList;

public class QuanLySachTuan6 {
    private ArrayList<SachTuan6> danhSachSach;

    public QuanLySachTuan6() {
        danhSachSach = new ArrayList<>();
    }
    public void themSach(SachTuan6 s) {
        danhSachSach.add(s);
    }
    public void xoaSach(String maSach) {
        danhSachSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }
    public SachTuan6 timSach(String maSach) {
        for (SachTuan6 s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        SachTuan6 s = timSach(maSach);
        if (s != null) {
            s.setSoLuong(s.getSoLuong() + soLuongMoi);

        } else {
            System.out.println("Không tìm thấy sách có mã: " + maSach);
        }
    }
    public void hienThiTatCa() {
        for (SachTuan6 s : danhSachSach) {
            System.out.println(s.toString());
        }
    }
}
