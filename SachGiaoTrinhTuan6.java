public class SachGiaoTrinhTuan6 extends SachTuan6 {
    private String monHoc;
    private String capDo;
    public SachGiaoTrinhTuan6() {
        super();
    }
    public SachGiaoTrinhTuan6(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                         String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    public String getMonHoc() {
        return monHoc;
    }
    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }
    public String getCapDo() {
        return capDo;
    }
    public void setCapDo(String capDo) {
        this.capDo = capDo;
    }
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Mon hoc: " + monHoc);
        System.out.println("Cap do: " + capDo);
        System.out.println("---------------------------");
    }
}
