
public class Overload {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double multiple(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 10)); // int 버전 호출
        System.out.println(add(5.5, 10.5)); // double 버전 호출
        System.out.println((int) multiple(5, 5)); // 25 정수를 사용해 소수점 제거
    }
}
