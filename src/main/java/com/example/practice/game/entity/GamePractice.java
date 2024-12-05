package com.example.practice.game.entity;

import lombok.Getter;

@Getter
public class GamePractice {
    static int gameIdCount = 0;

    private int number;
    private int gameId;

    public GamePractice(int number) {
        this.number = number;
        this.gameId = ++gameIdCount;
    }
}
