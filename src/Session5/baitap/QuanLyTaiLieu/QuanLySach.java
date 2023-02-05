package Session5.baitap.QuanLyTaiLieu;

import java.util.LinkedList;

public class QuanLySach {
    private LinkedList<TaiLieu> listTaiLieu = new LinkedList<>();

    public LinkedList<TaiLieu> getListTaiLieu() {
        return listTaiLieu;
    }

    public void setListTaiLieu(LinkedList<TaiLieu> listTaiLieu) {
        this.listTaiLieu = listTaiLieu;
    }

    public void addTaiLieu(TaiLieu taiLieu) {
        this.listTaiLieu.add(taiLieu);
    }

    public void removeTaiLieu(String code) {
        for (TaiLieu taiLieu: listTaiLieu) {
            if (taiLieu.getCode().equals(code)) {
                this.listTaiLieu.remove(taiLieu);
                break;
            }
        };
    }

    public void hienThiThongTin() {
        for (TaiLieu tl : listTaiLieu) {
            System.out.println(tl.toString());
        }
    }
    public void timKiemTheoLoai(String loai) {
        for (TaiLieu tl : listTaiLieu) {
            if (tl.getClass().getSimpleName().equals(loai)) {
                System.out.println(tl.toString());
            }
        }
    }

    public void thoatChuongTrinh() {
        System.exit(0);
    }
}
