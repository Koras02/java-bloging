
public class Main {

    public static void main(String[] args) {
        // 매개변수에 맞는 인자 전달
        Person myPerson = new Person("홍길동", 30);
        // 매개변수에 맞지 않은 인자 전달
        // Person myPerson2 = new Person("홍길동", 30, stack: "자바"); // 에러 발생

        myPerson.displayInfo();
    }
}

class Person {

    // 속성 (필드)
    String name; // 사람 이름
    int age; // 사람 나이

    // 생성자: 객체를 생성할 때 호출되는 메서드
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드: 사람이 뛰는 기능
    public void run() {
        System.out.println(name + "가 뜁니다.");
    }

    // 메서드: 사람의 정보 출력
    public void displayInfo() {
        System.out.println("이름:" + name + ". 나이" + age);
    }
}
