package com.example.practice.player.service;

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
    public void test() {
        log.info("practice test() called");

        playerPracticeRepository.test();
    }
}
