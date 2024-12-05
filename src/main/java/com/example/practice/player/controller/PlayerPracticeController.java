package com.example.practice.player.controller;

import com.example.practice.player.entity.PlayerPractice;
import com.example.practice.player.service.PlayerPracticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/practice/player")
public class PlayerPracticeController {
    final private PlayerPracticeService playerPracticeService;

    @GetMapping("/create")
    public PlayerPractice createPlayer(
            @RequestParam("name") String name
    ){
        return playerPracticeService.createPlayer(name);
    };

    @GetMapping("/list")
    public List<Map<String, Object>> playerList(){
        return playerPracticeService.list();
    }
}
