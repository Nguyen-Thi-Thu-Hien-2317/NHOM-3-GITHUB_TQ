public class SachGiaoTrinh extends SachTuan6
{
    private String monHoc;
    private String capHoc;
    public SachGiaoTrinh() 
    {
        super();
    }
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capHoc) 
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capHoc = capHoc;
    }
    public String getMonHoc() 
    {
        return monHoc;
    }
    public void setMonHoc(String monHoc) 
    {
        this.monHoc = monHoc;
    }
    public String getCapHoc() 
    {
        return capHoc;
    }
    public void setCapHoc(String capHoc) 
    {
        this.capHoc = capHoc;
    }
    @Override
    public void hienThiThongTin() 
    {
        super.hienThiThongTin();
        System.out.println("Mon hoc: " + monHoc);
        System.out.println("Cap hoc: " + capHoc);
        System.out.println("----------------------");
    }
}