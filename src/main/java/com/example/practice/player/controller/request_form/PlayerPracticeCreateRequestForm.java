package com.example.practice.player.controller.request_form;

import com.example.practice.player.service.request.PlayerPracticeCreateRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PlayerPracticeCreateRequestForm {
    private final String name;

    public PlayerPracticeCreateRequest toPlayerPracticeCreateRequest() {
        return new PlayerPracticeCreateRequest(this.name);
    }

}
