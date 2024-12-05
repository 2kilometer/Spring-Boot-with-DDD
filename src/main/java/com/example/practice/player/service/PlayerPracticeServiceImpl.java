package com.example.practice.player.service;

import com.example.practice.player.entity.PlayerPractice;
import com.example.practice.player.repository.PlayerPracticeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class PlayerPracticeServiceImpl implements PlayerPracticeService{
    final private PlayerPracticeRepository playerPracticeRepository;

    @Override
    public PlayerPractice createPlayer(String name) {
        log.info("service called");

        return playerPracticeRepository.createPlayer(name);
    }
}
