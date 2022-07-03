public class First {

    int add(int a, int b){
        return a + b;
    }

    void addInfo(){
        System.out.println("더한 값: " + add(5 , 7) + "입니다.");
    }

    public static void main(String[] args) {
        First a = new First();
        a.addInfo();
    }
}
