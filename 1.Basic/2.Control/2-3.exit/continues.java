
public class continues {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // 짝수일 때 현재 반복 건너뛰기
            }
            System.out.println("홀수: " + i);
        }
    }
}
