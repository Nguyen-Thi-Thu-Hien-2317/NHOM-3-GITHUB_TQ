import java.io.*;
import java.util.*;

public class QuanLySachlmpl implements IQuanLySach {
    private ArrayList<SachTuan9> danhSachSach = new ArrayList<>();

    @Override
    public void themSach(SachTuan9 s) {
        danhSachSach.add(s);
    }

    @Override
    public SachTuan9 timSachTheoMa(String ma) {
        for (SachTuan9 s : danhSachSach)
            if (s.getMaSach().equalsIgnoreCase(ma))
                return s;
        return null;
    }

    @Override
    public List<SachTuan9> timSachTheoTieuDe(String tieuDe) {
        ArrayList<SachTuan9> kq = new ArrayList<>();
        for (SachTuan9 s : danhSachSach)
            if (s.getTieuDe().toLowerCase().contains(tieuDe.toLowerCase()))
                kq.add(s);
        return kq;
    }

    @Override
    public List<SachTuan9> timSachTheoTacGia(String tacGia) {
        ArrayList<SachTuan9> kq = new ArrayList<>();
        for (SachTuan9 s : danhSachSach)
            if (s.getTacGia().toLowerCase().contains(tacGia.toLowerCase()))
                kq.add(s);
        return kq;
    }

    @Override
    public boolean xoaSachTheoMa(String ma) {
        SachTuan9 s = timSachTheoMa(ma);
        if (s != null) {
            danhSachSach.remove(s);
            return true;
        }
        return false;
    }

    @Override
    public void capNhatSoLuong(String ma, int soLuongMoi) {
        SachTuan9 s = timSachTheoMa(ma);
        if (s != null && soLuongMoi >= 0)
            s.setSoLuong(soLuongMoi);
    }

    @Override
    public void hienThiDanhSachSach() {
        if (danhSachSach.isEmpty()) System.out.println("Chua co sach nao.");
        else danhSachSach.forEach(System.out::println);
    }

    @Override
    public void sapXepTheoGia() {
        danhSachSach.sort(Comparator.comparingDouble(SachTuan9::tinhGiaBan));
    }

    @Override
    public double tinhTongGiaTriKho() {
        double tong = 0;
        for (SachTuan9 s : danhSachSach)
            tong += s.tinhGiaBan() * s.getSoLuong();
        return tong;
    }

    @Override
    public void luuFile(String tenFile) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(tenFile))) {
            for (SachTuan9 s : danhSachSach)
                pw.println(s.getMaSach() + "," + s.getTieuDe() + "," + s.getTacGia() + "," + s.getGiaCoBan());
            System.out.println(" Da luu du lieu vao file: " + tenFile);
        } catch (IOException e) {
            System.out.println(" Loi luu file: " + e.getMessage());
        }
    }

    @Override
    public void docFile(String tenFile) {
        try (Scanner sc = new Scanner(new File(tenFile))) {
            while (sc.hasNextLine()) {
                String[] parts = sc.nextLine().split(",");
                if (parts.length >= 4) {
                    SachTuan9 s = new SachGiaoTrinhTuan9();
                    s.maSach = parts[0];
                    s.tieuDe = parts[1];
                    s.tacGia = parts[2];
                    s.giaCoBan = Double.parseDouble(parts[3]);
                    danhSachSach.add(s);
                }
            }
            System.out.println(" Da doc du lieu tu file.");
        } catch (Exception e) {
            System.out.println(" Loi doc file: " + e.getMessage());
        }
    }
}