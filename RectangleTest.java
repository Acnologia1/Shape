package Lession4;

public class RectangleTest {
    public static void main(String[] args){
        Rectangle1 rectangle = new Rectangle1();
        System.out.println(rectangle);
        rectangle = new Rectangle1(2.3,5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle1(2.5,3.7,"orange",true);
        System.out.println(rectangle);
    }
}
