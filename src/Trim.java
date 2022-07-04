public class Trim {
    public static void main(String[] args) {
        String str = new String("   JAVA     ");
        System.out.println(str + '|'); //    JAVA     |
        System.out.println(str.trim()); // JAVA
    }
}
