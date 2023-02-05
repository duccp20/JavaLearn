package Session4.baiTap;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        //bai 1
//        Scanner sc = new Scanner(System.in);
//        HashMap<Character, Integer> map = new HashMap<>();
//        map.put('I', 1);
//        map.put('V', 5);
//        map.put('X', 10);
//        map.put('L', 50);
//        map.put('C', 100);
//        map.put('D', 500);
//        map.put('M', 1000);
//        System.out.print("Input: ");
//        String s = sc.nextLine();
//        int sum = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
//                sum += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
//            } else {
//                sum += map.get(s.charAt(i));
//            }
//        }
//        System.out.println("Output: " + sum);

        //bai2
//        Scanner sc = new Scanner(System.in);
//        HashMap<String, Character> map = new HashMap<>();
//        System.out.print("Input: ");
//        String s = sc.nextLine();
//        for (int i = 1; i <= 9; i++) {
//            map.put(i + "", (char) ('a' + i - 1));
//        }
//        for (int i = 10; i <= 26; i++) {
//            map.put(i + "#", (char) ('j' + i - 10));
//        }
//        LinkedList<String> listStringAfterSplit = new LinkedList<>();
//        for (int i = 0; i < s.length(); i++) {
//            listStringAfterSplit.addLast(String.valueOf(s.charAt(i)));
//            if(s.charAt(i) == '#') {
//                for (int j = 0; j < 3; j++) {
//                    listStringAfterSplit.remove(listStringAfterSplit.size() - 1);
//                }
//                listStringAfterSplit.add(s.substring((i-2), i+1));
//            }
//        }
//        String res = "";
//        for (String e: listStringAfterSplit) {
//            if (map.containsKey(e)) {
//                res  += map.get(e);
//            }
//        }
//        System.out.println("Output: " + res);
    }
}

