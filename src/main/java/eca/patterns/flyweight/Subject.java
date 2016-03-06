package eca.patterns.flyweight;

/**
 * Interface implemented by the RealSubject and representing its services.
 * The interface must be implemented by the proxy as well so that the proxy can be used in any location where the RealSubject can be used.
 */
public interface Subject {

    void doOperation();
}
