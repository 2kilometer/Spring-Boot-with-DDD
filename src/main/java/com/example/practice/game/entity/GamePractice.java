package com.example.practice.game.entity;

import lombok.Getter;

@Getter
public class GamePractice {
    static int gameIdCount = 0;

    private int gameId;

    public GamePractice() {
        this.gameId = ++gameIdCount;
    }
}
