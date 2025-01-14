package syntax.lesson16;

import java.time.LocalDateTime;

public class Printf {
    public static void main(String[] args) {
        // %s - string
        var name  = "Nurik";
        System.out.printf("Hello, %s %n",name);

        System.out.println();
//      %d - integer
        int age  = 19;
        System.out.printf("I'm %d years old%n",age);
//      %f - float or double number
        double height = 1.75;
        System.out.printf("My height is %5.2f m%n",height);

//        %tF- data %tT  - time
        LocalDateTime now = LocalDateTime.now();
        System.out.printf("Current data %tF and time %tT",now,now);



    }
}
