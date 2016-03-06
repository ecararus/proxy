package eca.patterns.flyweight;

import org.testng.annotations.Test;

public class ClientTest {

    @Test
    public void operation() throws Exception {
        Client client = new Client();
        client.operation();
    }

}