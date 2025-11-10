import java.util.*;

public interface IQuanLySach {
    void themSach(SachTuan9 s);
    SachTuan9 timSachTheoMa(String ma);
    List<SachTuan9> timSachTheoTieuDe(String tieuDe);
    List<SachTuan9> timSachTheoTacGia(String tacGia);
    boolean xoaSachTheoMa(String ma);
    void capNhatSoLuong(String ma, int soLuongMoi);
    void hienThiDanhSachSach();
    void sapXepTheoGia();
    double tinhTongGiaTriKho();
    void luuFile(String tenFile);
    void docFile(String tenFile);
}