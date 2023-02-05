package Session5.baitap.QuanLyTaiLieu;

public class Newspaper extends TaiLieu{
    private String ngayPhatHanh;

    public Newspaper(String id, String publisher, int numRelease, String ngayPhatHanh) {
        super(id, publisher, numRelease);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Báo || Mã: " + this.getCode() + "| " + " Nhà xuất bản: " +  this.getNamePublicCompany() + "| " + " Số lượng xuất bản: " + this.getQuantityPublic() +"| " + "Ngày phát hành: " + this.getNgayPhatHanh();
    }
}
