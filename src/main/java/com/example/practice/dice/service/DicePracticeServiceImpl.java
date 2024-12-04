package com.example.practice.dice.service;

import com.example.practice.dice.entity.Dice;
import com.example.practice.dice.repository.DicePracticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DicePracticeServiceImpl implements DicePracticeService {
    final private DicePracticeRepository dicePracticeRepository;

    @Override
    public Dice rollDice() {
        return dicePracticeRepository.rollDice();
    }
}
