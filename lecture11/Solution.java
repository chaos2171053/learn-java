// •	程序必须在屏幕上显示文本。
// •	不要更改 Cat 类。
// •	不要更改 Dog 类。
// •	不要更改 Bird 类。
// •	不要更改 Lamp 类。
// •	printObjectType() 方法必须显示以下消息之一，具体取决于传递给它的对象。例如，对于 Solution.Lamp 对象，它应该显示“灯”。
public class Solution {

    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        // 在此编写你的代码

    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}