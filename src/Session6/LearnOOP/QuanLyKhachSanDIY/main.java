package Session6.LearnOOP.QuanLyKhachSanDIY;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        LinkedList<Phong> listPhong = new LinkedList<>();
        KhachSan khachSan = new KhachSan();
        LinkedList<KhachHang> listDanhGia = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------------");
            System.out.println("Các chức năng của chương trình");
            System.out.println("1. Thêm phòng");
            System.out.println("2. Xem số lượng phòng hiện tại của khách sạn");
            System.out.println("3. Xem những phòng nào còn trống");
            System.out.println("4. Đặt phòng");
            System.out.println("5. Kiểm tra tình trạng phòng theo ID");
            System.out.println("6. Thêm thông tin khách hàng và đanh giá của khách hàng");
            System.out.println("7. Xem rating mà tổng khách hàng đã đánh giá");
            System.out.println("0. Thoát chương trình");
            System.out.println("-------------");
            System.out.println("Vui lòng chọn:");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 0) {
                System.out.println("Bạn đã thoát chương trình");
                System.exit(0);
            }

            switch (choice) {
                case 1:
                    System.out.println("Nhập id phòng: ");
                    String id = sc.nextLine();
                    System.out.println("Nhập loại phòng: ");
                    String type = sc.nextLine();
                    System.out.println("Nhập giá phòng: ");
                    double price = sc.nextDouble();
                    listPhong.add(new Phong(id, type, price));
                    System.out.println("Thêm thành công!!");
                    break;
                case 2:
                    System.out.println("Số lượng phòng hiện tại của khách sạn: " + listPhong.size());
                    break;
                case 3:
                    System.out.println("Những phòng còn trống có ID: ");
                    khachSan.getIdRoomHasBooked(listPhong);
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.print("Đây là những phòng còn trống: ");
                    khachSan.getIdRoomHasBooked(listPhong);
                    System.out.println();
                    System.out.println("Nhập ID phòng muốn đặt: ");
                    String roomID = sc.nextLine();
                    System.out.println("Nhập ngày đến, nhập đúng định dạng (yyyy-MM-dd): ");
                    String start = sc.nextLine();
                    System.out.println("Nhập ngày đi: nhập đúng định dạng (yyyy-MM-dd)");
                    String end = sc.nextLine();
                    System.out.println("Nhập tên khách hàng: ");
                    String name = sc.nextLine();
                    DatPhong datPhong = new DatPhong(roomID, new SimpleDateFormat("yyyy-MM-dd").parse(start),
                            new SimpleDateFormat("yyyy-MM-dd").parse(start), name);
                    System.out.println("Đã đặt phòng thành công!");
                    khachSan.setStateRoom(listPhong, roomID);
                    break;
                case 5:
                    System.out.println("Nhập ID phòng cần kiểm tra tình trạng:");
                    String maPhong = sc.nextLine();
                    khachSan.setStateRoomById(listPhong, maPhong);
                    break;
                case 6:
                    System.out.println("Nhập tên khách hàng: ");
                    String nameKH = sc.nextLine();
                    System.out.println("Nhập tuổi khách hàng: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập giới tính khách hàng: ");
                    String gender = sc.nextLine();
                    System.out.println("Nhập số điên thoại khách hàng: ");
                    String phoneNumber = sc.nextLine();
                    String regex = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
                    while (true) {
                        boolean check = phoneNumber.matches(regex);
                        if (check) {
                            System.out.println("Bạn đã nhấm đúng định dạng!!");
                            break;
                        } else {
                            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!!");
                        }
                        phoneNumber = sc.nextLine();
                    }
                    System.out.println("Nhập số sao khách hàng đã đánh giá: ");
                    int rating = sc.nextInt();
                    KhachHang khachHang = new KhachHang(nameKH, age, gender, phoneNumber, rating);
                    listDanhGia.add(khachHang);
                    System.out.println("Nhập thành công!!");
                    break;
                case 7:
                    System.out.print("Rating của khách sạn: " + khachSan.tinhRating(listDanhGia));
                    System.out.println();
            }
        }
    }
}
