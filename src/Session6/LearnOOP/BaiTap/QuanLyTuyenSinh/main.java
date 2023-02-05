package Session6.LearnOOP.BaiTap.QuanLyTuyenSinh;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        TuyenSinh listThiSinh = new TuyenSinh();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-----------------");
            System.out.println("Chương trình có các chức năng sau:");
            System.out.println("1. Nhập thông tin thí sinh");
            System.out.println("2. Hiển thị thông tin thí sinh theo ID");
            System.out.println("3. Để thoát chương chính");
            System.out.println("-----------------");
            System.out.println("Vui lòng chọn :");

            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 3) {
                System.out.println("Bạn đã thoát chương trnh");
                System.exit(0);
            }

            switch (choice) {
                case 1:
                    System.out.println("Nhập khối đang ký của thí sinh: (A, B, C)");
                    String grade = sc.nextLine();

                    if (grade.equals("A")) {
                        System.out.println("Nhập ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nhập tên: ");
                        String name = sc.nextLine();
                        System.out.println("Nhập địa chỉ: ");
                        String address = sc.nextLine();
                        System.out.println("Nhập khu vực ưu tiên: ");
                        int priorityArea = sc.nextInt();
                        listThiSinh.add(new ThiSinhKhoiA(id, name, address, priorityArea));
                        System.out.println("Nhập thông tin thành công!!");
                    } else if (grade.equals("B")) {
                        System.out.println("Nhập ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nhập tên: ");
                        String name = sc.nextLine();
                        System.out.println("Nhập địa chị: ");
                        String address = sc.nextLine();
                        System.out.println("Nhập khu vực ưu tiên: ");
                        int priorityArea = sc.nextInt();
                        listThiSinh.add(new ThiSinhKhoiB(id, name, address, priorityArea));
                    } else if (grade.equals("C")) {
                        System.out.println("Nhập ID: ");
                        int id = sc.nextInt();
                        System.out.println("Nhập tên: ");
                        sc.nextLine();
                        String name = sc.nextLine();
                        System.out.println("Nhập địa chị: ");
                        String address = sc.nextLine();
                        System.out.println("Nhập khu vực ưu tiên: ");
                        int priorityArea = sc.nextInt();
                        listThiSinh.add(new ThiSinhKhoiC(id, name, address, priorityArea));
                    }
                    break;
                case 2:
                    System.out.println("Nhập id thí sinh muốn hiển thị thông tin");
                    int id = sc.nextInt();
                    listThiSinh.display(id);
                    break;
            }
        }
    }
}
