package eca.patterns.flyweight;

/**
 * Maintains a reference that allows the Proxy to access the RealSubject.
 * Implements the same interface implemented by the RealSubject so that the Proxy can be substituted for the RealSubject.
 * Controls access to the RealSubject and may be responsible for its creation and deletion.
 * Other responsibilities depend on the kind of proxy.
 */
public class Proxy implements Subject {

    private final String message;

    public Proxy(String message) {
        this.message = message;
    }

    public void doOperation() {
        //Create RealSubject and prepare message only when it is required.
        Subject subject = new RealSubject("proxied message " + message);
        subject.doOperation();
    }
}
