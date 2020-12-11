import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws Exception {
        int[] data = new int[] { 1, 2, 3, 5, -2, -8, 0, 77, 5, 5 };

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("最小值为 " + result.x);
        System.out.println("最大值为 " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        // 在此编写你的代码
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();

        return new Pair<Integer, Integer>(min, max);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
