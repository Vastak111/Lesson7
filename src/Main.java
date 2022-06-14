import beans.Circle;

public class Main {
    public static void main(String[] args) {

        Class<Circle> circleClass = Circle.class; // That's a reflection!

        System.out.println(circleClass.getName());
        System.out.println(circleClass.getSimpleName());

        var annotations = circleClass.getAnnotations();
        for (var annotation: annotations) {
            System.out.println(annotation.toString());
        }
    }


}