package singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        System.out.println(instance);

        Singleton anotherInstance = Singleton.getInstance();

        System.out.println(anotherInstance);
    }
}
