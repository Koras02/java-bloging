
interface Soccer {

    void dribble(); // 드리블 

    void kick(); // 슛 

    void handle(); // 펀칭

    void success(); // 펀칭 성공공
}

interface Constants {

    int MAX_SPEED = 120; // public static final 생략 가능 
}

// 디폴트 메서드와 정적 메서드
interface Animal {

    void makeSound();

    default void sleep() {
        System.out.println("동물이 잠을 자고 있음");
    }
}

class Player implements Soccer {

    @Override
    public void dribble() {
        System.out.println("드리블");
    }

    @Override
    public void kick() {
        System.out.println("슈팅");
    }

    @Override
    public void handle() {
        System.out.println("플레이어어가 스로인");
    }

    @Override
    public void success() {
        System.out.println("골인!");
    }
}

class Keeper implements Soccer {

    @Override
    public void dribble() {
        System.out.println("골키퍼가 공을 잡고 서있습니다");
    }

    @Override
    public void kick() {
        System.out.println("골키퍼가 공을 멀리 보냅니다!");
    }

    @Override
    public void handle() {
        System.out.println("펀칭");
    }

    @Override
    public void success() {
        System.out.println("골키퍼가 펀칭했습니다.");
    }
}

public class Main {

    public static void main(String[] args) {
        Soccer player = new Player();
        Soccer keeper = new Keeper();
        player.dribble(); // 드리블
        player.kick(); // 슈팅

        keeper.handle(); // 펀칭
        keeper.kick(); // 공을 멀리 보냄

        // 정적 메서드
        interface Utility {

            static void printHello() {
                System.out.println("Hello");
            }
        }

        // 사용 
        Utility.printHello(); // Hello

    }
}
