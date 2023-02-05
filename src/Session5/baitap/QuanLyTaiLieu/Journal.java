package Session5.baitap.QuanLyTaiLieu;

public class Journal extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;

    public Journal(String code, String namePublicCompany, int quantityPublic, int soPhatHanh, int thangPhatHanh) {
        super(code, namePublicCompany, quantityPublic);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
    @Override
    public String toString() {
        return "Tạp chí || Mã: " + this.getCode() + "|" + " Nhà xuất bản: " +  this.getNamePublicCompany() + "|" + " Số lượng xuất bản: " + this.getQuantityPublic() + "| " + "Số phát hành: " + this.getSoPhatHanh() + "| " + "Tháng phát hành: " + this.getThangPhatHanh();
    }
}
