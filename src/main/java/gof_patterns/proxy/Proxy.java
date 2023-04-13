package gof_patterns.proxy;

public class Proxy implements Server {

    @Override
    public void method1() {
        ServerImpl server = new ServerImpl();
        server.method1();
    }
}
