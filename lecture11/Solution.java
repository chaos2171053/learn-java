// •	程序应在屏幕上显示文本。
// •	Whale 类必须继承 Cow 类。
// •	Whale 类必须重写 getName() 方法。
// •	main() 方法必须调用 Cow 对象的 getName() 方法。
// •	重写 Whale 类中的 getName 方法，从而使程序显示：“我不是奶牛。我是一条鲸鱼。”
// •	main() 方法应显示调用 getName() 方法的结果。

public class Solution {

    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "我是一头牛";
        }
    }

    public static class Whale extends Cow {
        public String getName() {
            return "我不是奶牛。我是一条鲸鱼。";
        }
    }
}