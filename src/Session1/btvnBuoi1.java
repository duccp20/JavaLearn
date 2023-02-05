package Session1;

import java.util.Arrays;
import java.util.Scanner;

public class btvnBuoi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Nhập phần tử: ");
        for (int i = 0; i <  5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("In mang" +  Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int caiLy = arr[j];
                    arr[j] =  arr[i];
                    arr[i] = caiLy;
                }
            }
        }
        System.out.println("Mang sau sap xep" + Arrays.toString(arr));
//        3 5 2 6 7
        //bài 1
//        Scanner s = new Scanner(System.in);
//        System.out.print("Nhập số phần tử mảng mà bạn muốn: ");
//        int size = s.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("Phần tử thứ %d : " , i);
//            arr[i] = s.nextInt();
//        }
//        System.out.println("Mảng gồm các phần tử: " + Arrays.toString(arr));
//        System.out.print("Nhập K :");
//        int k =  s.nextInt();
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == k) {
//                count++;
//            }
//        }
//        System.out.println("Tổng các phần tử K trong mảng: " + count);

        //bài 2
//        Scanner s = new Scanner(System.in);
//        System.out.print("Nhập số phần tử mảng mà bạn muốn: ");
//        int size = s.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("Phần tử thứ %d : ", i);
//            arr[i] = s.nextInt();
//        }
//        System.out.println("Mảng gồm các phần tử: " + Arrays.toString(arr));
//        int sum = arr[0] + arr[arr.length - 1];
//        System.out.print("Tổng phần tử đầu và cuối của mảng " + sum);

        //bài 3
//        Scanner s = new Scanner(System.in);
//        System.out.print("Nhập chuỗi : ");
//        String str = s.nextLine();
//        System.out.print("Nhập start: ");
//        int start = s.nextInt();
//        System.out.print("Nhập end: ");
//        int end = s.nextInt();
//        System.out.print("Chuỗi bị cắt theo vị trí start và end: " + str.substr(start-1,end));

        //bài 4
//        Scanner s = new Scanner(System.in);
//        System.out.print("Nhập số phần tử mảng mà bạn muốn: ");
//        int size = s.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("Phần tử thứ %d : ", i);
//            arr[i] = s.nextInt();
//        }
//        System.out.println("Mảng gồm các phần tử: " + Arrays.toString(arr));
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        double avg = (float) sum / arr.length;
//        System.out.println("Trung bình của mảng: " + avg);

        //bài 5
//        Scanner s = new Scanner(System.in);
//        System.out.print("Nhập vào một chuỗi: ");
//        String str = s.nextLine();
//        System.out.print("Nhập vào một ký tự: ");
//        char kyTu = s.next().charAt(0);
//
//        int index = -1;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == kyTu) {
//                index = i;
//            }
//        }
//
//        if (index != -1) {
//            System.out.println("Ký tự " + kyTu + " (cuối cùng) nằm tại ví trí " + index);
//        } else {
//            System.out.println("Ký tự không tồn tại");
//        }

        //bài 6
//        Scanner s = new Scanner(System.in);
//        System.out.print("Nhập số phần tử mảng mà bạn muốn: ");
//        int size = s.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("Phần tử thứ %d : ", i);
//            arr[i] = s.nextInt();
//        }
//        System.out.println("Mảng gồm các phần tử: " + Arrays.toString(arr));
//        long sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println("Tổng các phẩn tử trong mảng: " + sum);

        //bài 7
//        Scanner s = new Scanner(System.in);
//        System.out.print("Nhập số phần tử mảng mà bạn muốn: ");
//        int size = s.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("Phần tử thứ %d : ", i);
//            arr[i] = s.nextInt();
//        }
//        System.out.println("Mảng gồm các phần tử: " + Arrays.toString(arr));
//
//        boolean mangDoiXung = true;
//        for (int i = 0; i < arr.length / 2; i++)  {
//            if (arr[i] != arr[arr.length - i - 1]) {
//                mangDoiXung = false;
//                break;
//            }
//        }
//        if(mangDoiXung) {
//            System.out.println("Đây là mảng đối xứng");
//        } else {
//            System.out.println("Đây không phải là mảng đối xứng");
//        }

        //bai 8
//        Scanner s = new Scanner(System.in);
//        int count = 1;
//        while (true) {
//            String str = s.nextLine();
//            System.out.println(count++ + " " +  str);
//        }

        //bai 9
//        Scanner s = new Scanner(System.in);
//        System.out.print("Nhập số phần tử mảng mà bạn muốn: ");
//        int size = s.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("Phần tử thứ %d : ", i);
//            arr[i] = s.nextInt();
//        }
//        System.out.println("Mảng gồm các phần tử: " + Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
//        System.out.println("Mảng đã được sắp xếp: " + Arrays.toString(arr));
//        int min_sum = 0;
//        int max_sum = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            min_sum += arr[i];
//        }
//        for (int i = 1; i < arr.length; i++) {
//            max_sum += arr[i];
//        }
//
//        System.out.println("Tổng tối thiếu là: "+ min_sum + " và tổng tối đa là: " + max_sum);
    }
}
