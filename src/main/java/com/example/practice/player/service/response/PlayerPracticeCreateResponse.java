package com.example.practice.player.service.response;

import com.example.practice.player.entity.PlayerPractice;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PlayerPracticeCreateResponse {
    private final String nickname;
    private final boolean success;

    public static PlayerPracticeCreateResponse from(PlayerPractice playerPractice) {
        if (playerPractice == null) {
            return new PlayerPracticeCreateResponse("", false);
        }

        return new PlayerPracticeCreateResponse(playerPractice.getName(), true);
    }
}
