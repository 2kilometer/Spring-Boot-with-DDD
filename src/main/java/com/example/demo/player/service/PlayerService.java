package com.example.demo.player.service;

import com.example.demo.player.service.request.PlayerCreateRequest;
import com.example.demo.player.service.response.PlayerCreateResponse;

public interface PlayerService {
    PlayerCreateResponse createPlayer(PlayerCreateRequest playerCreateRequest);
}
