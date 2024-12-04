package com.example.practice.player.entity;

import lombok.Getter;

@Getter
public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }
}
