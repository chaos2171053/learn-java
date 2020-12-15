/* 
•	Pet 类必须为 abstract。
•	Dog 类不能为 abstract。
•	Cat 类不能为 abstract。
•	Dog 类必须实现 Pet 类的 abstract 方法。
•	Cat 类必须实现 Pet 类的 abstract 方法。
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        @Override
        public String getName() {
            return null;
        }

        @Override
        public Solution.Pet getChild() {
            return null;
        }

    }

    public static class Dog extends Pet {

        @Override
        public String getName() {
            return null;
        }

        @Override
        public Solution.Pet getChild() {

            return null;
        }
    }
}
