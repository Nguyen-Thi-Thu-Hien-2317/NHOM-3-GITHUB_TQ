import java.util.ArrayList;

public class QuanLySachTuan6 {
    private ArrayList<SachTuan6> danhSach = new ArrayList<>();

    public void themSach(SachTuan6 s) {
        danhSach.add(s);
    }

    public boolean xoaSach(String maSach) {
        for (SachTuan6 s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.remove(s);
                return true;
            }
        }
        return false;
    }

    public SachTuan6 timKiem(String maSach) {
        for (SachTuan6 s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    public boolean capNhat(String maSach, SachTuan6 moi) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.set(i, moi);
                return true;
            }
        }
        return false;
    }

    public void hienThiTatCa() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            System.out.println("===== DANH SACH SACH =====");
            for (SachTuan6 : danhSach) {
                System.out.println(s.toString());
            }
        }
    }
}