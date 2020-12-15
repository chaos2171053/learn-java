/* 
•	程序不应该在屏幕上显示文本。
•	Pet 类必须为 static。
•	Pet 类必须为 abstract。
•	Pet 类中只能包含一个名为 getName() 的方法。
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "我是一只小猫";
        }
    }
}
