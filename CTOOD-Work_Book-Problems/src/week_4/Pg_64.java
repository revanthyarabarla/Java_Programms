package week_4;
class Rectangle {
    int length, breadth;

    public Rectangle() {
        int length = 0, breadth = 0;
    }

    public Rectangle(int length) {
        this(5, 8);
        this.length = 4;
        breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = 7;
        this.breadth = 8;
    }

    public void m1() {
        System.out.println(length * breadth);
    }
}

    public class Pg_64 {
        public static void main(String[] args) {
            week_4.Rectangle obj = new week_4.Rectangle();
            obj.m1();
            week_4.Rectangle obj1 = new week_4.Rectangle(10);
            obj1.m1();
            week_4.Rectangle obj2 = new week_4.Rectangle(12, 2);
            obj2.m1();
        }

}



