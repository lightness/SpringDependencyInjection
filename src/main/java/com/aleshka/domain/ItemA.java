package com.aleshka.domain;

import org.springframework.stereotype.Component;


@Component
public class ItemA implements Sendable
{
    public void send()
    {
        System.out.println("Item A sent");
    }
}
