/* 
	Solution 类必须包含只有一个 fly() 方法的 CanFly 接口。
•	Solution 类必须包含只有一个 move() 方法的 CanMove 接口。
•	Solution 类必须包含只有一个 eat() 方法的 CanEat 接口。
•	狗必须能够四处走动并进食。
•	汽车必须能够移动。
•	飞机必须能够移动和飞行。
•	鸭子应该能够移动、飞行和进食。
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {

        @Override
        public void eat() {
            // TODO Auto-generated method stub

        }

        @Override
        public void move() {
            // TODO Auto-generated method stub

        }
    }

    public class Duck implements CanMove, CanFly, CanEat

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void fly() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void move() {
			// TODO Auto-generated method stub
			
		} {
    }

    public class Car implements CanMove {

		@Override
		public void move() {
			// TODO Auto-generated method stub
			
		}
    }

    public class Airplane implements CanMove,CanFly {

		@Override
		public void fly() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void move() {
			// TODO Auto-generated method stub
			
		}
    }
}
