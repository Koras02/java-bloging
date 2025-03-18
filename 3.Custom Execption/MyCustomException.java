// 사용자 정의 예외 클래스 

public class MyCustomException extends Exception {

    public MyCustomException(String message) {
        super(message); // 부모 클래스의 생성자 호출
    }
}
