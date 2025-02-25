public class LazyInitialization {
    // The instance is initially null
    private static LazyInitialization instance;

    // Private constructor to prevent instantiation from other classes
    private LazyInitialization() {
        System.out.println("LazyInitialization instance created!");
    }

    // Public method to access the instance (lazy initialization)
    public static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();  // Create instance when it's needed
        }
        return instance;
    }

    // A simple method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from LazyInitialization!");
    }

    public static void main(String[] args) {
        System.out.println("Before calling getInstance()");

        // Instance will only be created here, when getInstance() is called
        LazyInitialization lazyInit = LazyInitialization.getInstance();
        lazyInit.showMessage();

        // Instance won't be created again, since it's already initialized
        LazyInitialization anotherInstance = LazyInitialization.getInstance();
        anotherInstance.showMessage();
    }
}
