public class SachGiaoTrinhTuan6 extends SachTuan6 {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinhTuan6(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc,
            String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public String toString() {
        return "[Giao trinh] " + super.toString() +
                String.format(" | Mon hoc: %s | Cap do: %s", monHoc, capDo);
    }
}