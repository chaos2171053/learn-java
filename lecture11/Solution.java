import java.util.ArrayList;
import java.util.Collections;

/* 
构建家庭
*/

public class Solution {
    public static void main(String[] args) {
        Human c1 = new Human("C1", true, 15);
        Human c2 = new Human("C2", false, 10);
        Human c3 = new Human("C3", true, 5);

        Human f = new Human("F", true, 33, c1, c2, c3);
        Human m = new Human("M", false, 29, c1, c2, c3);

        Human grandF1 = new Human("GF1", true, 69, f);
        Human grandM1 = new Human("GM1", false, 65, f);

        Human grandF2 = new Human("GF2", true, 63, m);
        Human grandM2 = new Human("GM2", false, 62, m);

        System.out.println(grandF1);
        System.out.println(grandM1);
        System.out.println(grandF2);
        System.out.println(grandM2);
        System.out.println(f);
        System.out.println(m);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;

        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;

            Collections.addAll(this.children, children);
        }

        public String toString() {
            String text = "";
            text += "名字：" + this.name;
            text += "，性别：" + (this.sex ? "男" : "女");
            text += "，年龄：" + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += "，孩子：" + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += "，" + child.name;
                }
            }
            return text;
        }
    }

}
