class Singleton {

    // Static variable to hold the single instance
    private static Singleton instance;

    // Private constructor prevents object creation from outside
    private Singleton() {
        System.out.println("Singleton Object Created");
    }

    // Public method to get the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class Main {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        System.out.println(obj1 == obj2);
    }
}