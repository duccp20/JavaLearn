package Session5.baitap.QuanLyTaiLieu;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach quanLySach = new QuanLySach();
        while (true) {
            System.out.println("----------------------------------");
            System.out.println("Sau đây là các chức năng của phần mềm, hãy chọn số theo chỉ dẫn phía dưới để thực hiện chức năng: ");
            System.out.println("1. Thêm tài liệu mới");
            System.out.println("2. Xóa tài liệu theo ID");
            System.out.println("3. Hiển thị tất cả tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại");
            System.out.println("5. Thoát chương trình");
            System.out.println("-----------------------------------");
            System.out.print("Mời bạn chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 5) {
                System.out.println("Đã thoát chương trình");
                quanLySach.thoatChuongTrinh();
            }
            switch (choice) {
                case 1:
                    System.out.println("Chọn loại tài liệu muốn thêm, vui lòng nhập đúng (Book, Journal, Newspaper): ");
                    String type = sc.nextLine();
                    System.out.println("Nhập ID: ");
                    String code = sc.nextLine();
                    System.out.println("Nhập nhà xuất bản: ");
                    String publisher = sc.nextLine();
                    System.out.println("Nhập số lượng xuất bản: ");
                    int releaseNum = sc.nextInt();
                    sc.nextLine();
                    if (type.equals("sach")) {
                        System.out.println("Nhập tên tác giả: ");
                        String author = sc.nextLine();
                        System.out.println("Nhập số trang: ");
                        int pages = sc.nextInt();
                        sc.nextLine();
                        quanLySach.addTaiLieu(new Book(code, publisher, releaseNum, author, pages));
                    } else if (type.equals("tapchi")) {
                        System.out.println("Nhập số báo: ");
                        int issueNum = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nhập tháng xuất bản: ");
                        int releaseMonth = sc.nextInt();
                        sc.nextLine();
                        quanLySach.addTaiLieu(new Journal(code, publisher, releaseNum, issueNum, releaseMonth));
                    } else if (type.equals("bao")) {
                        System.out.println("Nhập ngày xuất bản: ");
                        String releaseDate = sc.nextLine();
                        quanLySach.addTaiLieu(new Newspaper(code, publisher, releaseNum, releaseDate));
                    }
                    break;
                case 2:
                    System.out.println("Nhập ID tài liệu muốn xóa: ");
                    code = sc.nextLine();
                    quanLySach.removeTaiLieu(code);
                    System.out.println("Xóa thành công!");
                    break;
                case 3:
                    quanLySach.hienThiThongTin();
                    break;
                case 4:
                    System.out.println("Nhập loại sách, vui lòng nhập đúng (Book, Journal, Newspaper): ");
                    type = sc.nextLine();
                   quanLySach.timKiemTheoLoai(type);
                    break;
            }
        }
    }
}
