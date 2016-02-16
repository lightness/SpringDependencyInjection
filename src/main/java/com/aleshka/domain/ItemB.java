package com.aleshka.domain;

import org.springframework.stereotype.Component;


@Component
public class ItemB implements Sendable
{
    public void send()
    {
        System.out.println("Item B sent");
    }
}
