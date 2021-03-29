package singleton;

public class Singleton {

    // volatile, to make the singleton thread safe
    // helping us to unsure that the instance will remain a singleton through any of
    // changes inside of the JVM
    private static volatile Singleton instance = null;

    private Singleton(){
        // to ensure that nobody uses reflection on our code.
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class) { // thread-safe
                if (instance == null) {
                    instance = new Singleton(); // Lazily loaded
                }
            }
        }
        return instance;
    }
}
