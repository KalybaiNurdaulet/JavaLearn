package syntax.lesson13_null;

public class NullDemo {
    public static void main(String[] args) {
        String nullableString = null;
//        nullableString.length() or any method create Exception
        System.out.println(nullableString);
        Integer nullableInt = null;
        System.out.println(nullableInt);
    }
}
