import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5,"Indigo", false);

        System.out.println("Pre-sorted: ");
        Arrays.stream(circles).forEach(System.out::println);
        Arrays.sort(circles);

        System.out.println("After-sorted: ");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
