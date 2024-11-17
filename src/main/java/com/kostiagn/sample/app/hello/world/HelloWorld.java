package com.kostiagn.sample.app.hello.world;

public class HelloWorld {
    public void start() {
        while (true) {
            System.out.println("i'm alive");
            try {
                Thread.sleep(60_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
