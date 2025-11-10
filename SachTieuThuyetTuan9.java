import java.util.Scanner;

public class SachTieuThuyetTuan9 extends SachTuan9 {
    private boolean laSachSeries;

    public SachTieuThuyetTuan9() {}

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTinChung(sc);
        sc.nextLine();
        System.out.print("La sach series? (true/false): ");
        laSachSeries = sc.nextBoolean();
    }

    @Override
    public double tinhGiaBan() {
        return laSachSeries ? giaCoBan * 1.2 : giaCoBan * 1.1;
    }

    @Override
    public String toString() {
        return super.toString() + " | Series: " + (laSachSeries ? "Co" : "Khong");
    }
}
