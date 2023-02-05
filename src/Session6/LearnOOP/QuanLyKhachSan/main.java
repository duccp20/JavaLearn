package Session6.LearnOOP.QuanLyKhachSan;

import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        LinkedList<Phong> listPhong = new LinkedList<>();
        LinkedList<DanhGia> listDanhGia = new LinkedList<>();

        listPhong.add(new Phong("P01", "VIP", 5000.00));
        listPhong.add(new Phong("P02", "Normal", 5000.00));
        listPhong.add(new Phong("P03", "VIP", 5000.00));
        listPhong.add(new Phong("P04", "VIP", 5000.00));
        listPhong.add(new Phong("P05", "VIP", 5000.00));


        DanhGia danhGia = new DanhGia(new KhachHang("Nam", 20, "Nam", "0352145268" ), 5  );
        DanhGia danhGia1 = new DanhGia(new KhachHang("Nam1", 20, "Nam", "0352145268" ), 4  );
        DanhGia danhGia2 = new DanhGia(new KhachHang("Nam2", 20, "Nam", "0352145268" ), 3  );
        listDanhGia.add(danhGia);
        listDanhGia.add(danhGia1);
        listDanhGia.add(danhGia2);

        double star = danhGia.tinhTrungBinhSoSao(listDanhGia);
        KhachSan khachSan = new KhachSan("ABC", "Sài Gòn", star, listPhong.size());

        LinkedList<DatPhong> listDatPhong = new LinkedList<>();
//        listDatPhong.add(new DatPhong("2023-03-03", "5/3/2023", "P01", "Nam"));
//        listDatPhong.add(new DatPhong("3/3/2023", "5/3/2023", "P02", "Nam1"));
//        listDatPhong.add(new DatPhong("3/3/2023", "5/3/2023", "P03", "Nam2"));

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Các chức năng của chương trình");
        }
    }
}
