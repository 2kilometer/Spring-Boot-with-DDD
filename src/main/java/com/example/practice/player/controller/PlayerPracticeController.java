package com.example.practice.player.controller;

import com.example.practice.player.service.PlayerPracticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/practice/player")
public class PlayerPracticeController {
    final private PlayerPracticeService playerPracticeService;

    @GetMapping("/create")
    public void createPlayer(){
        log.info("practice createPlayer() called");

        playerPracticeService.test();
    };
}
