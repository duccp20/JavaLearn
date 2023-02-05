package Session5.LearnOOP.QuanLyThongTinSanPham;

public class SanPhamIplm implements SanPham{
    private String name;
    private double price;
    private int quantity;

    public SanPhamIplm(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void getInfo() {
        System.out.println(this.name + "|" + this.price + "|" + this.quantity + "|" + this.tinhGiaTriSanPham(price, quantity));
    }

    @Override
    public double tinhGiaTriSanPham(double price, int quantity) {
        return  this.price * this.quantity;
    }
//    Viết một lớp quản lý thông tin sản phẩm với các thuộc tính như tên sản phẩm, giá, số lượng
//    và các phương thức như nhập thông tin, hiển thị thông tin và tính tổng giá trị sản phẩm.
}
