// 디폴트 메서드와 정적 메서드
interface Animal {

    void makeSound();

    default void sleep() {
        System.out.println("동물이 잠을 자고 있음");
    }
}