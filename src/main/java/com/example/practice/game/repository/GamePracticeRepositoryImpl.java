package com.example.practice.game.repository;

import com.example.practice.dice.repository.DicePracticeRepository;
import com.example.practice.game.entity.GamePractice;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@RequiredArgsConstructor
@Repository
public class GamePracticeRepositoryImpl implements GamePracticeRepository {
    final private DicePracticeRepository dicePracticeRepository;

    @Override
    public GamePractice createSimpleGame() {
        int diceNumber = dicePracticeRepository.rollDice().getNumber();
        GamePractice gamePractice = new GamePractice(diceNumber);

        return gamePractice;
    }
}
