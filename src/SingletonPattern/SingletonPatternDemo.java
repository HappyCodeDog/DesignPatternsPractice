package SingletonPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject instance1 = SingleObject.getInstance();
        instance1.showMessage();

        SingleObject instance2 = SingleObject.getInstance();
        instance2.showMessage();
    }
}
