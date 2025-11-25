public class SachTieuThuyetTuan6 extends SachTuan6 {
    private String theLoai;
    private boolean laSachSeries;
    public SachTieuThuyetTuan6() {
        super();
    }
    public SachTieuThuyetTuan6(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                          String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    public String getTheLoai() {
        return theLoai;
    }
    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
    public boolean isLaSachSeries() {
        return laSachSeries;
    }
    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("The loai: " + theLoai);
        System.out.println("Thuoc series: " + (laSachSeries ? "Co" : "Khong"));
        System.out.println("---------------------------");
    }
}
