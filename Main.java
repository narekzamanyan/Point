public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(4, 4);
        Point p2 = new Point(3, 19);

        System.out.println(p1.distance());
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));




    }
}