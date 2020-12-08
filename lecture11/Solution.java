import java.util.HashMap;
import java.util.Map;

/* 
共享的姓氏和名字
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        // 在此编写你的代码
        Map<String, String> people = new HashMap<>();
        people.put("Xiao7", "Ming");
        people.put("Xiao6", "Hong1");
        people.put("Xiao1", "Hong2");
        people.put("Xiao2", "Hong3");
        people.put("Xiao3", "Hong4");
        people.put("Xiao3", "Hong5");
        people.put("Xiao5", "Hong");
        people.put("Hong1", "Ming");
        people.put("Hong2", "Ming");
        people.put("Xiao66", "Ming6");
        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
