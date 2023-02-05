package Session2;

import org.w3c.dom.ls.LSOutput;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Nhap so dong ");
        int soDong = s.nextInt();
        System.out.print("Nhap so cot ");
        int soCot = s.nextInt();
        int[][] arr = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                arr[i][j] = s.nextInt();
            }

        }
        System.out.println("In mảng ra màn hình:");
        int[][] printArr = print(arr, soDong, soCot);
//        int tongArr = tinhTong(arr, soDong, soCot);
//        System.out.println("Tong = " + tongArr);
//        int maxArr = timMax(arr, soDong, soCot);
//        System.out.println("Max la" + maxArr);
//        System.out.print("Nhap so muon tim ");
//        int soDaChon = s.nextInt();
//        int timSoArr = timSo(arr, soDong, soCot, soDaChon);
//        System.out.printf("So %d xuat hien %d lan \n", soDaChon, timSoArr);
//        int[][] daoNguocMang = mangDaoNguoc(arr, soDong, soCot);
//        int[][] printMangDaoNguoc = print(daoNguocMang, soDong, soCot);
        System.out.println("In mảng sắp xếp giảm dần: ");
        int[][] sapXepMangGiamDan = sapXepGiamDan(arr);

    }

    public static int[][] print(int[][] array, int soDong, int soCot) {
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return array;
    }

    public static int tinhTong(int[][] arr, int soDong, int soCot) {
        int sum = 0;
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                sum += arr[i][j];
            }

        }
        return sum;
    }

    public static int timMax(int[][] arr, int soDong, int soCot) {
        int max = arr[0][0];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

        }
        return max;
    }

    public static int timSo(int[][] arr, int soDong, int soCot, int soChon) {
        int count = 0;
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (arr[i][j] == soChon) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int[][] mangDaoNguoc(int[][] arr, int soDong, int soCot) {
        for (int i = 0; i < soDong / 2; i++) {
            for (int j = 0; j < soCot; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[soDong - i - 1][soCot - j - 1];
                arr[soDong - i - 1][soCot - j - 1] = temp;
            }
        }
        return arr;

    }

    public static int[][] sapXepGiamDan(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int max = arr[i][j];
                int maxRow = i;
                int maxCol = j;
                for (int k = i; k < arr.length; k++) {
                    for (int l = 0; l < arr[k].length; l++) {
                        if (arr[k][l] < max) {
                            max = arr[k][l];
                            maxRow = k;
                            maxCol = l;
                        }
                    }
                }
                int temp = arr[i][j];
                arr[i][j] = arr[maxRow][maxCol];
                arr[maxRow][maxCol] = temp;
            }
        }

        // in ra ma trận sau khi sắp xếp
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        return arr;
    }
}
