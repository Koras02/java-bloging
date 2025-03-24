
public class GarbageCollection {

    public static void main(String[] args) {
        Object obj = new Object();
        obj = null;

        System.gc();
    }
}
