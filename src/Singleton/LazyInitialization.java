package Singleton;


public class LazyInitialization {
    private static  LazyInitialization instance;

    private LazyInitialization() {

    }

    public  static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }
}


    /** ava Library Examples
     *
     *  java.lang.Runtime.getRuntime()
     *  java.awt.Desktop.getDesktop()
     *  java.lang.System.getSecurityManager()
      */
    // Criticism Unncessary restrictions and introducing global state to the application