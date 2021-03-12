

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(50,50, 10);
        Circle circle2 = new Circle (50,500,10);
        System.out.println(circle1.computeAreal());
        System.out.println(circle1.computeCircumference());
        System.out.println(circle1.computeCenter());
        circle1.checkPoint(55,55);
        System.out.println(euclideanDistance(circle1, circle2));

        Rectangle rectangle1 = new Rectangle(50,50,10,10);
        System.out.println(rectangle1.computeCenter());
        System.out.println(rectangle1.checkPoint(60,60));
        System.out.println(euclideanDistance(rectangle1, circle1));

        Triangle triangle1 = new Triangle(5,5,2,2);
        System.out.println("Arealet af trekanten er: " + triangle1.computeAreal());
        System.out.println("Trekant omkreds: " + triangle1.computeCircumference());
        System.out.println(triangle1.computeCenter());
    }

    public static double euclideanDistance(Shape s1, Shape s2){
        double distance = Math.sqrt((s2.computeCenter().getX() - s1.computeCenter().getX()) * (s2.computeCenter().getX() - s1.computeCenter().getX())
                + (s2.computeCenter().getY()-s1.computeCenter().getY()) * (s2.computeCenter().getY()-s1.computeCenter().getY()));
        return distance;
    }
}
