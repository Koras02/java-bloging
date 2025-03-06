
interface Animal {

    void speak();
}

class Dog implements Animal {

    @Override
    public void speak() {
        System.out.println("멍멍!");
    }
}

class Cat implements Animal {

    @Override
    public void speak() {
        System.out.println("야용!");
    }
}

public class Main {

    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.speak(); // 출력: 멍멍!
        myCat.speak(); // 출력: 야용!
    }
}
