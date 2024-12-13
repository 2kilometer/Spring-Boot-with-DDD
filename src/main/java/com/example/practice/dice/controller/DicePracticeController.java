package com.example.practice.dice.controller;

import com.example.practice.dice.entity.DicePractice;
import com.example.practice.dice.service.DicePracticeService;
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
    final private DicePracticeService dicePracticeService;

    @GetMapping("/roll-dice")
    public DicePractice rollDice() {
        DicePractice acquiredDice = dicePracticeService.rollDice();

        return acquiredDice;
    }
}
