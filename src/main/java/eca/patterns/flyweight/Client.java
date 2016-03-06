package eca.patterns.flyweight;

/**
 * The user of Proxy.
 */
public class Client {

    public void operation() {
        Subject subject = new RealSubject("Hi");
        Subject proxy = new Proxy("Hi");
        subject.doOperation();
        proxy.doOperation();
    }

}
