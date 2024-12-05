package com.example.practice.game.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class GamePracticeRepositoryImpl implements GamePracticeRepository {
    @Override
    public void test() {
        log.info("test() called");
    }
}
