package com.example.practice.player.service;

import com.example.practice.player.entity.PlayerPractice;

import java.util.List;
import java.util.Map;

public interface PlayerPracticeService {
    PlayerPractice createPlayer(String name);
    List<Map<String, Object>> list();
}
