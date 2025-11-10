import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<SachTuan7> danhSach = new ArrayList<>();

    public ArrayList<SachTuan7> getDanhSach() {
        return danhSach;
    }

    public void themSach(SachTuan7 s) {
        danhSach.add(s);
    }

    public void hienThiTatCa() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            System.out.println("===== DANH SACH SACH =====");
            for (SachTuan7 s : danhSach) {
                System.out.println(s.toString());
                System.out.println("Gia ban uoc tinh: " + s.tinhGiaBan() + " VND");
            }
        }
    }
}
