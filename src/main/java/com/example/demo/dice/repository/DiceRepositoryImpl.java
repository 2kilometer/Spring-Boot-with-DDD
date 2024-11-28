package com.example.demo.dice.repository;

import com.example.demo.dice.entity.Dice;
import org.springframework.stereotype.Repository;

@Repository
public class DiceRepositoryImpl implements DiceRepository {
    final int MIN = 1;
    final int MAX = 6;

    private int createdRandomNumber() {
        int randomNumber = (int) (Math.random() * MAX) + MIN;
        return randomNumber;
    }

    @Override
    public Dice rollDice() {
        int randomNumber = createdRandomNumber();

        Dice dice = new Dice(randomNumber);

        return dice;
    }
}
