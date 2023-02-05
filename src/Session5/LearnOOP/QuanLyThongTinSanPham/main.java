package Session5.LearnOOP.QuanLyThongTinSanPham;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        String name  = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        Double price = sc.nextDouble();
        System.out.println("Nhập số lượng sản phẩm: ");
        int quantity = sc.nextInt();

        SanPham sanPham = new SanPhamIplm(name, price, quantity);
        sanPham.tinhGiaTriSanPham(price, quantity);
        sanPham.getInfo();

    }
}
