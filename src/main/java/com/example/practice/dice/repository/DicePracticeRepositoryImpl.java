package com.example.practice.dice.repository;

import com.example.practice.dice.entity.DicePractice;
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
    public DicePractice rollDice() {
        int randomNumber = createRandomNumber();

        DicePractice dicePractice = new DicePractice(randomNumber);

        return dicePractice;
    }
}
