package com.example.practice.dice.service;

import com.example.practice.dice.entity.DicePractice;
import com.example.practice.dice.repository.DicePracticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DicePracticeServiceImpl implements DicePracticeService {
    final private DicePracticeRepository dicePracticeRepository;

    @Override
    public DicePractice rollDice() {
        int randomNumber = (int)(Math.random() * 6) + 1;
        DicePractice dice = new DicePractice(randomNumber);
        DicePractice rolledDice = dicePracticeRepository.save(dice);

        return rolledDice;
    }
}
