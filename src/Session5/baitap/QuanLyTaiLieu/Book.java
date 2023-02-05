package Session5.baitap.QuanLyTaiLieu;

public class Book extends TaiLieu{
    private String nameAuthor;
    private int quantityPage;

    public Book(String code, String namePublicCompany, int quantityPublic, String nameAuthor, int quantityPage) {
        super(code, namePublicCompany, quantityPublic);
        this.nameAuthor = nameAuthor;
        this.quantityPage = quantityPage;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getQuantityPage() {
        return quantityPage;
    }

    public void setQuantityPage(int quantityPage) {
        this.quantityPage = quantityPage;
    }

    @Override
    public String toString() {
        return "Sách || Mã: " + this.getCode() + "| " + " Nhà xuất bản: " +  this.getNamePublicCompany() + "| " + " Số lượng xuất bản: " + this.getQuantityPublic() +"| " + "Tên tác giả: " + this.getNameAuthor() + "| " + " Số lượng trang: " + this.getQuantityPage();
    }
}
