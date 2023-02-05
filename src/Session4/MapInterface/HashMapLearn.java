package Session4.MapInterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapLearn {
    public static void main(String[] args) {

//        HashMap<Integer, String> lop = new HashMap<>();
//        HashMap<Integer, String> lop2 = new HashMap<>();
//        HashMap<Integer, String> lopChung = new HashMap<>();
//        HashMap<Integer, String> res = new HashMap<>();
//
//        lop.put(1, "A");
//        lop.put(3, "B");
//        lop.put(4, "C");
//
//        lop2.put(2, "B");
//        lop2.put(3, "C");
//        lop2.put(4, "D");


//        lop.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()));
//        System.out.println(lop);



//       bai2. Tạo một Map mới và giữ lại các phần tử không chung giữa hai Map khác

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "a");
        map1.put(2, "b");
        map1.put(3, "c");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(2, "b");
        map2.put(3, "c");
        map2.put(4, "d");

        Map<Integer, String> result = new HashMap<>(map1);
        Map<Integer, String> result1 = new HashMap<>();
        map1.keySet().removeAll(map2.keySet());
        map2.keySet().removeAll(result.keySet());
        result1.putAll(map1);
        result1.putAll(map2);
        System.out.println(result1);


    }
}
