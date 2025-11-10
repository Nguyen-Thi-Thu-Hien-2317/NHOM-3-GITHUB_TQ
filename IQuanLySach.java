import java.util.List;

public interface IQuanLySach {
    void themSach(SachTuan8 s);

    SachTuan8 timKiemTheoMa(String maSach);

    boolean xoaSach(String maSach);

    void hienThiTatCa();

    List<SachTuan8> getDanhSach();
}