package com.example.practice.player.service;

import com.example.practice.player.entity.PlayerPractice;
import com.example.practice.player.service.request.PlayerPracticeCreateRequest;
import com.example.practice.player.service.response.PlayerPracticeCreateResponse;

import java.util.List;
import java.util.Map;

public interface PlayerPracticeService {
    PlayerPracticeCreateResponse create(PlayerPracticeCreateRequest playerPracticeCreateRequest);
    List<PlayerPractice> playerList();
}
