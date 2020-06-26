package DesignPatterns.Singleton;

public class Singleton4 {
    private static class Singleton4ClassInstance {
        private static Singleton4 instance = new Singleton4();
    }

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return Singleton4ClassInstance.instance;
    }
}
