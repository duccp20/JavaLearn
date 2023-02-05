package Session3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;


public class ArrayListLearn {
    public static void main(String[] args) {
//        //1
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 10; i <= 200; i++) {
//            list.add(i);
//        }
//
//        System.out.println("Cac so chia het cho 7 va khong la boi cua 5");
//        for (int value : list){
//            if (value % 7 == 0 && value % 5 != 0 ) {
//                System.out.println(value);
//            }
//        }
        //2. Viet giai thua 1 so nhap tu ban phim
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println("Nhập phần tử: ");
//        int value = sc.nextInt();
//        list.add(value);
//
//        System.out.print("Giai thừa của số nhập vào là :");
//        int giaiThua = list.get(0);
//        for (int i = 2; i < list.get(0); i++) {
//            giaiThua *= i;
//        }
//        System.out.print(giaiThua);
        //3. Check só nguyên tố
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.print("Nhập start: ");
//        int start = sc.nextInt();
//        System.out.print("Nhập end : ");
//        int end = sc.nextInt();
//        for (int i = start; i <= end; i++) {
//            list.add(i);
//        }
//        for (int i = 0; i <= end - start; i++) {
//            int element = list.get(i);
//            boolean isCheck = true;
//            for (long j = 2; j < element; j++) {
//                if ( element < 2 || element % j == 0) {
//                    isCheck = false;
//                    break;
//                }
//            }
//            if (isCheck) {
//                System.out.println(element + " là số nguyên tố");
//            } else {
//                System.out.println(element + " không là số nguyên tố");
//            }
//        }


        //4. Dùng Stream.
//        ArrayList<Integer> list = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập số phần tử mong muốn: ");
//        int size  = sc.nextInt();
//
//        int value;
//        for (int i = 0; i < size; i++) {
//            System.out.println("Nhập số");
//
//            value = sc.nextInt();
//            list.add(value);
//            System.out.println("-----");
//        }
//        for (int e: list ) {
//            System.out.println(e);
//        }
//        System.out.println("In ra cac so le: ");
//        list.stream()
//                .filter(e -> e % 2 != 0)
//                .forEach(e -> System.out.println(e));
        ArrayList<Integer> fruits = new ArrayList<>();
        fruits.add(1);
        fruits.add(2);
        fruits.add(3);

       ArrayList<Integer> list2 = new ArrayList<>();
       list2.add(3);
       list2.add(4);
       list2.add(5);
       list2.add(6);

       fruits.addAll( list2);
        fruits.retainAll(list2);
        System.out.println(fruits);
    }
}

//map, treemap, set, treeset;