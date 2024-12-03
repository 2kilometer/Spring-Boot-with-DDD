package com.example.practice.dice.controller;

import com.example.practice.dice.entity.Dice;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/practice/dice")
public class DicePracticeController {
    final private DiceService diceService;

    @GetMapping("/roll-dice")
    public Dice rollDice() {
//        log.info("practice roll-dice()called");

        Dice acquiredDice = diceService.rollDice();

        return acquiredDice;
    }
}
