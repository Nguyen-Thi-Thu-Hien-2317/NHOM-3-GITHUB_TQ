import java.util.ArrayList;
public class QuanLySach
{
    private ArrayList<SachTuan6> danhSach;
    public QuanLySach() 
    {
        danhSach = new ArrayList<>();
    }
    // Thêm sách mới
    public void themSach(SachTuan6 s) 
    {
        danhSach.add(s);
    }
    // Xóa sách theo mã
    public boolean xoaSach(String maSach) 
    {
        for (SachTuan6 s : danhSach) 
        {
            if (s.getMaSach().equalsIgnoreCase(maSach)) 
            {
                danhSach.remove(s);
                return true;
            }
        }
        return false;
    }
    // Cập nhật sách (ví dụ: đổi giá)
    public boolean capNhatSach(String maSach, double giaMoi) 
    {
        for (Sach s : danhSach) 
        {
            if (s.getMaSach().equalsIgnoreCase(maSach)) 
            {
                s.setGia(giaMoi);
                return true;
            }
        }
        return false;
    }
    // Tìm sách theo mã
    public Sach timSach(String maSach) 
    {
        for (Sach s : danhSach) 
        {
            if (s.getMaSach().equalsIgnoreCase(maSach)) 
            {
                return s;
            }
        }
        return null;
    }
    // Hiển thị toàn bộ sách
    public void hienThiDanhSach() 
    {
        if (danhSach.isEmpty()) 
        {
            System.out.println("Danh sach sach trong.");
        } else 
        {
            for (Sach s : danhSach) 
            {
                System.out.println(s.toString());
            }
        }
    }
}