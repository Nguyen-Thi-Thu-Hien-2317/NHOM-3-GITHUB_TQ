import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<SachTuan8> danhSach = new ArrayList<>();

    @Override
    public void themSach(SachTuan8 s) {
        danhSach.add(s);
        System.out.println("Da them sach: " + s.getTieuDe());
    }

    @Override
    public SachTuan8 timKiemTheoMa(String maSach) {
        for (SachTuan8 s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean xoaSach(String maSach) {
        SachTuan8 s = timKiemTheoMa(maSach);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("Da xoa sach: " + s.getTieuDe());
            return true;
        }
        return false;
    }

    @Override
    public void hienThiTatCa() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            System.out.println("===== DANH SACH SACH =====");
            for (SachTuan8 s : danhSach) {
                System.out.println(s);
            }
        }
    }

    @Override
    public List<SachTuan8> getDanhSach() {
        return danhSach;
    }
}
