package Session6.LearnOOP.QuanLyKhachSan;

import java.util.LinkedList;

public class DanhGia {
    private KhachHang khachHang;
    private int numStar;

    public DanhGia(KhachHang khachHang, int numStar) {
        this.khachHang = khachHang;
        this.numStar = numStar;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public int getNumStar() {
        return numStar;
    }

    public void setNumStar(int numStar) {
        this.numStar = numStar;
    }

    public double tinhTrungBinhSoSao(LinkedList<DanhGia> list) {
        int sum = 0;
        for (DanhGia e : list) {
            sum += e.getNumStar();
        }
        double avg = (float) sum / list.size();
        return avg;
    }
}
