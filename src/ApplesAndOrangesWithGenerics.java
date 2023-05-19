import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        for (Apple c : apples) {
            System.out.println(c.id());
        }
    }
}
