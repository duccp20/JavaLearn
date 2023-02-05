package Session3;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {

//        1. Cho 1 array list cho phép người dùng nhập 5 phần tử vào array đó , và in ra dãy Fibonacci của từng phần tử
//        ArrayList<Integer> list = new ArrayList<>();
//        Scanner s = new Scanner(System.in);
//        System.out.println("Hãy nhập 5 phần tử bất kì");
//        for (int i = 0; i < 5; i++) {
//            System.out.printf("Phần từ thứ %d: ", i + 1);
//            int element = s.nextInt();
//            list.add(element);
//        }
//        System.out.print("Các phần tử trong list: ");
//        for (int e : list) {
//            System.out.print(e + "\t");
//        }
//        System.out.println("\n-------------");
//        for (int i = 0; i < list.size(); i++) {
//            int element = list.get(i);
//            if (element <= 0) {
//                System.out.println("Không có dãy fibonaci cho phần từ " + element);
//            } else {
//                System.out.print(element + " số đầu tiên của dãy Fibanocci: ");
//                for (int j = 0; j < element; j++) {
//                    int dayFibonacci = fibonacci(j);
//                    System.out.print(dayFibonacci + "\t");
//                }
//                System.out.println();
//            }
//        }


        //    2.cho 1 array list(char)add bất kỳ 3 phần tử và Tìm mã ASCII(tìm hiểu về ASCII) của một ký tự trong Java4

        ArrayList<Character> listChar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 ký tự bất kỳ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Nhập ký tự thứ %d : ", i+1);
            char c = scanner.nextLine().charAt(0);
            listChar.add(c);
        }
        System.out.print("Các ký tử trong list: ");
        listChar.stream()
                .forEach(e -> System.out.print(e + "\t"));
        System.out.println("\n-----------------");
        listChar.stream()
                .forEach(e -> System.out.println("Mã ACII của các phần tử: " + e +": " + (int) e));

    }


    //fn
    public static int fibonacci(int element) {
        int f0 = 0;
        int f1 = 1;
        int fn = f0 + f1;
        if (element < 0) {
            return -1;
        } else if (element == 0 || element == 1) {
            return element;
        } else {
            for (int i = 2; i < element; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
}



