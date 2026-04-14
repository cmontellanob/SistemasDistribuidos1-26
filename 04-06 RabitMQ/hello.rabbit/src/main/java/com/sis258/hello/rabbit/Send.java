/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sis258.hello.rabbit;

/**
 *
 * @author Dell
 */
import com.rabbitmq.stream.*;
import java.io.IOException;

public class Send {

    public static void  main(String[] args) throws IOException  {
        Environment environment = Environment.builder().build();
        String stream = "hello-java-stream";
        environment.streamCreator().stream(stream).maxLengthBytes(ByteCapacity.GB(5)).create();
        Producer producer = environment.producerBuilder().stream(stream).build();
        producer.send(producer.messageBuilder().addData("Hello, World!".getBytes()).build(), null);
        System.out.println(" [x] 'Hello, World!' message sent");
    }

}
