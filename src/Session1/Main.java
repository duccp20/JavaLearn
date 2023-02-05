package Session1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        String address = "abc";
//        System.out.println(address);
//        String age = "10";
//        System.out.print(address + age);
//        int age = 11;
//        System.out.println(age);
//        int nb1 = 10;
//        int nb2 = 10;
//        System.out.println(nb1 + nb2);
//        double nb = 1.5;
//        int nb2 = 1;
//        System.out.println(nb + nb2);
//        for (int i = 0; i <= 5; i++) {
//            System.out.println(i);
//        }
//        Scanner s = new Scanner(System.in);
//        System.out.print("Nhập số:");
//        int a = s.nextInt();
//        if ( a % 2 == 0) {
//            System.out.println("Đây là số chẵn");
//        } else {
//            System.out.println("Đây là số lẻ");
//        }//
//        int arr[] = new int[]{1, 2, 3, 4, 5};
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 == 0) {
//                System.out.println(arr[i] + "Đây là số chẵn");
//            } else {
//                System.out.println(arr[i] + "Đây là số lẻ");
//            }
//        }
//        int arr[];
//        int size;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Nhập số lượng phần tử mong muốn: ");
//        size = s. nextInt();
//        arr = new int[size];
//        System.out.println("Nhập các giá trị của mảng: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = s.nextInt();
//            System.out.println(arr[i]);
//        }
//        for (int i = 1; i <= 5; ++i) {
//            for (int j = 1; j <= i ; ++j) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        int[] arr;
        int size;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập sô phần tử: ");
        size = s.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Các phần tử: " + arr[i]);
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất:" + min);
        System.out.println("Giá trị lớn nhất:" + tenHam(arr));
        System.out.println("Vị trí lớn thứ 2 " + timViTriLonThuHai(arr, size));
//        int[] arrSort = timViTriLonThuHai(arr, size);
//        for (int i = 0; i < arrSort.length; i++) {
//            System.out.println("Phần tử đã sắp xếp: " + arrSort[i]);
//        }
    }

    public static int tenHam(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int timViTriLonThuHai(int[] arr, int size) {
        int count = 0;
        int max = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] >  arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == arr[max]) {
                count++;
            }
        }
        int maxLonThuHai = arr[arr.length - count - 1];
        return maxLonThuHai;
    }
}

