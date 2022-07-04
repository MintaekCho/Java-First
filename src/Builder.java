public class Builder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello").append(" world"); //hello 문자열과 world 문자열을 연결
        System.out.println(stringBuilder);
        String str = stringBuilder.toString(); //해당 인스턴스를 문자열로 반환
        System.out.println(str);
    }
}
