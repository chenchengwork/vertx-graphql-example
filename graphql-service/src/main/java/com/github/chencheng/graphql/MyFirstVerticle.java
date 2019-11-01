package com.github.chencheng.graphql;
import io.vertx.core.AbstractVerticle;

public class MyFirstVerticle extends AbstractVerticle{
    public void start() {
        vertx.createHttpServer().requestHandler(req -> {
            req.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello World!");
        }).listen(8080);
    }

    static final String s1 = "Dog_s1";
    static  String s2 = "Dog_s2";
    static {
        System.out.println("Loading Dog");
    }

    public void test(){
        System.out.println("11111111111");
    }
}
