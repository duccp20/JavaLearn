package Session6.LearnOOP.BaiTap.QuanLyMuaBanSach;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BookStore bookStore = new BookStore();
        BookStore bookStoreSold = new BookStore();
        while (true) {
            System.out.println("--------------");
            System.out.println("1. Thêm sách");
            System.out.println("2. Mua sách");
            System.out.println("3. Bán sách");
            System.out.println("4. Xem doanh thu");
            System.out.println("5. Xem tổng lượng tiền nhập hàng");
            System.out.println("6. Xem tổng sách");
            System.out.println("7. Thoát chương trình");
            System.out.println("--------------");

            System.out.print("Mời bạn chọn: ");

            int choice = scanner.nextInt();
            if (choice == 7) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên sách: ");
                    String name = scanner.next();
                    System.out.print("Nhập giá sách: ");
                    double price = scanner.nextDouble();
                    System.out.print("Nhập số lượng sách: ");
                    int quantity = scanner.nextInt();
                    bookStore.addBook(new Book(name, quantity, price));
                    break;
                case 2:
                    System.out.print("Nhập tên sách: ");
                    String nameBuy = scanner.next();
                    System.out.print("Nhập giá sách: ");
                    double priceBuy = scanner.nextDouble();
                    System.out.print("Nhập số lượng sách: ");
                    int quantityBuy = scanner.nextInt();
                    System.out.println("Ngày mua sách: (Nhập đúng định dạng YYYY-mm-dd): ");
                    String dateBuy = scanner.next();
                    bookStore.buyBook(new Book(nameBuy, quantityBuy, priceBuy, new SimpleDateFormat("yyyy-MM-dd").parse(dateBuy)), quantityBuy);
                    break;
                case 3:
                    System.out.print("Nhập tên sách: ");
                    String nameSell = scanner.next();
                    System.out.print("Nhập giá sách: ");
                    double priceSell = scanner.nextDouble();
                    System.out.print("Nhập số lượng sách: ");
                    int quantitySell = scanner.nextInt();
                    System.out.print("Ngày bán sách: (Nhập đúng định dạng YYYY-mm-dd): ");
                    String dateSell = scanner.next();
                    bookStoreSold.addBook(new Book(nameSell, quantitySell, priceSell, new SimpleDateFormat("yyyy-MM-dd").parse(dateSell)));
                    bookStoreSold.sellBook(new Book(nameSell, quantitySell, priceSell, new SimpleDateFormat("yyyy-MM-dd").parse(dateSell)), quantitySell);

                    break;
                case 4:
                    System.out.println("Vui lòng chọn xem doanh thu theo Month hay Day: ");
                    String choiceRevenue = scanner.next();
                    if (choiceRevenue.equals("Month")) {
                        System.out.print("Nhập tháng: ");
                        int month = scanner.nextInt();
                        bookStoreSold.getRevenueByMonth(month);
                    } else if (choiceRevenue.equals("Day")) {
                        System.out.print("Nhập ngày: ");
                        int day = scanner.nextInt();
                        bookStoreSold.getRevenueByDay(day);
                    }


                    break;
                case 5:
                    System.out.println("Tổng lượng tiền nhập hàng: " + bookStore.getTotalImportValue());
                    break;
                case 6:
                    System.out.println("Tổng lượng sách có trong Store: " + bookStore.getInventoryCount());
                    break;
                default:
                    System.out.println("Vui lòng nhập lại!!.");
            }
        }
    }
}
