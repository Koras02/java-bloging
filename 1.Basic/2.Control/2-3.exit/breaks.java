
public class breaks {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // i가 5일 때 반복 종료
            }
            System.out.println("현재 값: " + i);
        }
    }
}
