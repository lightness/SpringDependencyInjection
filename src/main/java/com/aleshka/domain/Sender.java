package com.aleshka.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Sender
{
    @Autowired
    Sendable sendable;


    public void send(){
        sendable.send();
    }
}
