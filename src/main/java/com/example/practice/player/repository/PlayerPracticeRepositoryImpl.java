package com.example.practice.player.repository;

import com.example.practice.player.entity.PlayerPractice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class PlayerPracticeRepositoryImpl implements PlayerPracticeRepository{

    @Override
    public PlayerPractice createPlayer(String name) {
        log.info("repository called");
        PlayerPractice player = new PlayerPractice(name);

        return player;
    }
}

