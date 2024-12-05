package com.example.practice.player.repository;

import com.example.practice.player.entity.PlayerPractice;

import java.util.List;
import java.util.Map;

public interface PlayerPracticeRepository {
    PlayerPractice createPlayer(String name);
    List<Map<String, Object>> list();
}
