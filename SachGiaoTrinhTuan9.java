import java.util.Scanner;

public class SachGiaoTrinhTuan9 extends SachTuan9 {
    private String monHoc;
    private String capHoc;

    public SachGiaoTrinhTuan9() {}

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTinChung(sc);
        sc.nextLine();
        System.out.print("Nhap mon hoc: ");
        monHoc = sc.nextLine();
        System.out.print("Nhap cap hoc: ");
        capHoc = sc.nextLine();
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan * 1.1;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + monHoc + " | " + capHoc;
    }
}