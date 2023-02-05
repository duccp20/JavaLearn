package Session5.baitap.QuanLyCanBo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();

        while (true) {
            System.out.println("--------------------");
            System.out.println("Mời chọn chức năng:");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ và tên:");
            System.out.println("3. Hiển thị thông tin toàn bộ danh sách cán bộ");
            System.out.println("4. Thoát chương trình");
            System.out.println("--------------------");
            System.out.println("Mời bạn chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 4) {
                System.out.println("Đã thoát chương trình");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Vui lòng chọn cán bộ muốn thêm mới (CongNhan, KySu, NhanVien)");
                    String type = sc.nextLine();
                    System.out.println("Nhập họ và tên: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập tuổi: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập giới tính: ");
                    String gender = sc.nextLine();
                    System.out.println("Nhập địa chỉ: ");
                    String address = sc.nextLine();

                    if (type.equals("CongNhan")) {
                        System.out.println("Nhập thứ bậc: (Từ 1 - 10)");
                        int rank = sc.nextInt();
                        quanLyCanBo.addCanBo(new CongNhan(name, age, gender, address, rank));
                        System.out.println("Thêm thành công!");
                    } else if (type.equals("KySu")) {
                        System.out.println("Nhập ngành đào tạo: ");
                        String nganh = sc.nextLine();
                        quanLyCanBo.addCanBo(new KySu(name, age, gender, address, nganh));
                        System.out.println("Thêm thành công!");
                    } else if (type.equals("NhanVien")) {
                        System.out.println("Nhập công việc: ");
                        String congViec = sc.nextLine();
                        quanLyCanBo.addCanBo(new NhanVien(name, age, gender, address, congViec));
                        System.out.println("Thêm thành công!");
                    }
                    break;
                case 2:
                    System.out.println("Nhập họ và tên cần tìm kiếm: ");
                    String hoTen = sc.nextLine();
                    quanLyCanBo.findByName(hoTen);
                    break;
                case 3:
                    quanLyCanBo.displayAll();
                    break;
            }
        }
    }
}
