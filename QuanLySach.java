import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<SachTuan7> danhSachSach;

    public QuanLySach() {
        danhSachSach = new ArrayList<>();
    }

    public void themSach(SachTuan7 s) {
        danhSachSach.add(s);
    }

    public void hienThiDanhSachSach() {
        System.out.println("===== DANH SACH SACH =====");
        for (SachTuan7 s : danhSachSach) {
            System.out.println(s.toString());
            System.out.println("Gia ban uoc tinh: " + s.tinhGiaBan() + " VND");
            System.out.println("-----------------------------");
        }
    }
}