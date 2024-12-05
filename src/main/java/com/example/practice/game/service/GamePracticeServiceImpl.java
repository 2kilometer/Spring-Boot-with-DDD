package com.example.practice.game.service;

import com.example.practice.game.entity.GamePractice;
import com.example.practice.game.repository.GamePracticeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class GamePracticeServiceImpl implements GamePracticeService{
    final private GamePracticeRepository gamePracticeRepository;

    @Override
    public GamePractice createSimpleGame() {
        return gamePracticeRepository.createSimpleGame();
    }
}
