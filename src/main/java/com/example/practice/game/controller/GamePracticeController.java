package com.example.practice.game.controller;


import com.example.practice.game.service.GamePracticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/practice/game")
public class GamePracticeController {
    final private GamePracticeService gamePracticeService;

    @GetMapping("/test")
    public void test() {
        log.info("test() called");

        gamePracticeService.test();
    }
}
