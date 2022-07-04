import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args) {
        String str = new String("This is a string example using StringTokenizer");
        System.out.println(str);

        StringTokenizer tokenizer = new StringTokenizer(str);
        System.out.println("total token : " + tokenizer.countTokens());

        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
        System.out.println("total token : " + tokenizer.countTokens());
    }
}
