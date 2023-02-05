package Session4.SetInterface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetLearn {
    public static void main(String[] args) {
//        HashSet<Double> list = new HashSet<>();
//        Scanner sc = new Scanner(System.in);
//        Double last = null;
//        list.add(4.5);
//        list.add(2.5);
//        list.add(3.5);
//        list.add(5.5);
//        for ( Double m: list) {
//            System.out.println(m);
//        }
//        last = list.stream().reduce((one, two) -> two).get();
//        list.remove(last);
//        System.out.println("Sau khi xoa pha tu cuoi" + list);
//        System.out.println("Nhap so diem: ");
//        double diem = sc.nextDouble();
//
//        boolean isCheck = list.contains(diem);
//        System.out.println(isCheck);
        HashSet<Double> lop1 = new HashSet<>();
        HashSet<Double> lop2 = new HashSet<>();
        HashSet<Double> lopChungDiem = new HashSet<>();
        lop1.add(5.5);
        lop1.add(6.5);

        lop2.add(9.5);
        lop2.add(5.5);
        lop2.add(6.5);

        for (Double e : lop1) {
            if (!lop2.contains(e)) {
                lopChungDiem.add(e);
            }
        }
        for (Double e : lop2) {
            if (!lop1.contains(e)) {
                lopChungDiem.add(e);
            }
        }
        System.out.println(lopChungDiem);

//        lop1.removeIf(e-> e.compareTo(0.0));

//        lop1.stream()
//                .filter(e -> e == 0.0);
//        lop1.removeIf(e -> e == 0.0);
//
////        lop1.remove(0.0);
//        System.out.println(lop1);
    }
}
