package syntax;

public class StringDemo {
    public static void main(String[] args) {
        String strName = "Nurik";
        String strLastName = new String("Kalybay");
        System.out.println(strName + "  "+ strLastName);


//        equals() only for Strings
        String  s1 = "Hello";
        String s2 = "hello";
        System.out.println(strName.equals(strLastName)); // equals() return false
        System.out.println(s1 == s2);
//        equlsIgnoreCase()
        System.out.println(strName.equalsIgnoreCase(strLastName));// ignore register

//        .length()

//        substring find
        String greeting = "Hello , World!";
        String substring = greeting.substring(7);
        String substring1 = greeting.substring( greeting.indexOf("W"));// find the index of the character in the word
        System.out.println(substring);

//      check containing substring contains()
        System.out.println("Check "+greeting.contains("World"));
        greeting.toUpperCase();
        greeting.toLowerCase();

//        delete probels
        var login = "   nurik    ";
        String log = login.trim();
        System.out.println(log);

//        replace();
        var userName = "Nurik___2005";
        var repoUser = userName.trim().replace("_","!");
        System.out.println(repoUser);

    StringBuilder bd = new StringBuilder("Hello,");
    bd.append("Nurik");
    bd.append("  Kalybay!");
    System.out.println(bd);

    }
}
