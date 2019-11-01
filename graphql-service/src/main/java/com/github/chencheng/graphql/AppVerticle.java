package com.github.chencheng.graphql;

import io.vertx.core.Vertx;


/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class AppVerticle {

    public static void main(String[] args){
        // Create an HTTP server which simply returns "Hello World!" to each request.
//        Vertx.vertx().createHttpServer().requestHandler(req -> req.response().end("Hello World!")).listen(8080);
        Vertx vertx = Vertx.vertx();
        System.out.println(MyFirstVerticle.class);
        System.out.println(MyFirstVerticle.class.getClass());
        try{
            System.out.println(Class.forName("com.github.chencheng.graphql.MyFirstVerticle"));
        }catch (ClassNotFoundException e){

        }

        vertx.deployVerticle(MyFirstVerticle.class.getName());
    }
}

