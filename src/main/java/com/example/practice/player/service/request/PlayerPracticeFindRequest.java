package com.example.practice.player.service.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PlayerPracticeFindRequest {
    private final Long playerId;
}
