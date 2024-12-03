package com.example.practice.dice.service;

import com.example.demo.dice.entity.Dice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DicePracticeServiceImpl implements DicePracticeService {
    final private DiceRepository diceRepository;

    @Override
    public Dice rollDice() {
        return diceRepository.rollDice();
    }
}
