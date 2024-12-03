package com.example.practice.dice.repository;

import com.example.practice.dice.entity.Dice;
import org.springframework.stereotype.Repository;

@Repository
public class DicePracticeRepositoryImpl implements DicePracticeRepository {
    final int MIN = 1;
    final int MAX = 6;

    private int createRandomNumber() {
        int randomNumber = (int) (Math.random() * MAX) + MIN;
        return randomNumber;
    }

    @Override
    public Dice rollDice() {
        int randomNumber = createRandomNumber();

        Dice dice = new Dice(randomNumber);

        return dice;
    }
}
