package com.example.practice.player.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class PlayerPracticeRepositoryImpl implements PlayerPracticeRepository{
    @Override
    public void test() {
        log.info("practice test() called");
    }
}
