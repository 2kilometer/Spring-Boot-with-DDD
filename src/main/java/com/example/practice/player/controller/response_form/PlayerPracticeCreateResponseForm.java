package com.example.practice.player.controller.response_form;

import com.example.practice.player.service.response.PlayerPracticeCreateResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PlayerPracticeCreateResponseForm {
    private final String nickname;
    private final boolean success;

    public static PlayerPracticeCreateResponseForm from(PlayerPracticeCreateResponse playerPracticeCreateResponse) {
        return new PlayerPracticeCreateResponseForm(playerPracticeCreateResponse.getNickname(), playerPracticeCreateResponse.isSuccess());
    }
}
