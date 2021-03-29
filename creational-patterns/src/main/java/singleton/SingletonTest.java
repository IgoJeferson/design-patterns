package singleton;

public final class SingletonTest {

    private static SingletonTest instance;
    public String value;

    private SingletonTest(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonTest getInstance(String value) {
        if (instance == null) {
            instance = new SingletonTest(value);
        }
        return instance;
    }
}
