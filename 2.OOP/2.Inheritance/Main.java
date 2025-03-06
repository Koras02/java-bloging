
class Animal {

    void speak() {
        System.out.println("Anime is Speak");
    }
}

class Dog extends Animal {

    @Override
    void speak() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {

    @Override
    void speak() {
        System.out.println("야용!");
    }
}

public class Main {

    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.speak(); // 출력: 멍멍!
        myCat.speak(); // 출력: 야옹!
    }
}
