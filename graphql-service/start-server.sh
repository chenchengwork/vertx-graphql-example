#!/bin/bash

#启动jar包
java -classpath ./target/lib/*:./target/graphql-service-1.0-SNAPSHOT.jar com.github.chencheng.graphql.AppVerticle
