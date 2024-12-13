package com.example.practice.player.service.request;

import com.example.practice.player.entity.PlayerPractice;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PlayerPracticeCreateRequest {
    private final String name;

    public PlayerPractice toPlayer() {
        return new PlayerPractice(this.name);
    }
}
