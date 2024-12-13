package com.example.practice.player.controller.request_form;

import com.example.demo.player.service.request.PlayerFindRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PlayerPracticeFindRequestForm {
    private final Long playerId;

    public PlayerFindRequest toPlayerFindRequest() {
        return new PlayerFindRequest(this.playerId);
    }
}
