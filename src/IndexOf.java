public class IndexOf {
    public static void main(String[] args) {
        String str = new String("JAVA Oracle");
        System.out.println(str.indexOf('O')); //5 index값은 0부터 시작
        System.out.println(str.indexOf("acle")); //7 문자열일 경우 문자열 첫번째 문자의 index값 반환
        System.out.println(str.indexOf(' ')); //4 공백 위치도 반환됨
        System.out.println(str.indexOf('R')); //-1 대소문자 구별됨
    }
}
