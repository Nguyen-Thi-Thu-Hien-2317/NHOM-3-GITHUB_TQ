public class SachTieuThuyet extends SachTuan6
{
    private String theLoai;
    private boolean daChuyenThe;
    public SachTieuThuyet() 
    {
        super();
    }
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean daChuyenThe) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.daChuyenThe = daChuyenThe;
    }
    public String getTheLoai() 
    {
        return theLoai;
    }
    public void setTheLoai(String theLoai) 
    {
        this.theLoai = theLoai;
    }
    public boolean isDaChuyenThe() 
    {
        return daChuyenThe;
    }
    public void setDaChuyenThe(boolean daChuyenThe) 
    {
        this.daChuyenThe = daChuyenThe;
    }
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("The loai: " + theLoai);
        System.out.println("Da chuyen the thanh phim: " + (daChuyenThe ? "Co" : "Khong"));
        System.out.println("----------------------");
    }
}