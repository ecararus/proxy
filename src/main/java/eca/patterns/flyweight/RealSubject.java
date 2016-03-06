package eca.patterns.flyweight;

/**
 * The real object that the proxy represents.
 */
public class RealSubject implements Subject {

    private final String message;

    public RealSubject(String message) {
        this.message = prepareMessage(message);
    }

    private String prepareMessage(String message) {
        return " Base operation. "+ message;
    }

    public void doOperation() {
        System.out.println(message);
    }
}
