public class CompareTo {

    public static void main(String[] args) {
        String str = new String("abcd");
        System.out.println( str.compareTo("a"));
        System.out.println( str.compareTo("ABcd"));
        System.out.println( str.compareToIgnoreCase("ABCD"));
    }
}
