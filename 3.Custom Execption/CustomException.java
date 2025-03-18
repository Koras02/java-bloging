
public class CustomException {

    public static void main(String[] args) {
        try {
            checkValue(-1); // 음수 값을 체크
        } catch (MyCustomException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    // 특정 조건에서 사용자 정의 예외 메소드
    public static void checkValue(int value) throws MyCustomException {
        if (value < 0) {
            throw new MyCustomException("값은 0보다 커야 함."); // 예외 발생
        }
        System.out.println("입력 값: " + value);
    }
}
