package Session5.LearnOOP.QuanLyThongTinSinhVien;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên:" );
        String name = sc.nextLine();
        System.out.print("Nhập tuổi sinh viên: ");
        int age = sc.nextInt();
        System.out.println("Nhập điểm môn Toán:");
        double toan = sc.nextDouble();
        System.out.println("Nhập điểm môn Văn: ");
        double van = sc.nextDouble();
        System.out.println("Nhập điểm môn Anh: ");
        double anh = sc.nextDouble();
        double point[] = new double[]{toan, van, anh};

        SinhVien sinhVien = new SinhVien(name, age, point);
        sinhVien.pointOutPut();
    }

}
