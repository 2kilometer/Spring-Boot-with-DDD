package com.example.practice.player.controller;

import com.example.practice.player.controller.request_form.PlayerPracticeCreateRequestForm;
import com.example.practice.player.controller.response_form.PlayerPracticeCreateResponseForm;
import com.example.practice.player.entity.PlayerPractice;
import com.example.practice.player.service.PlayerPracticeService;
import com.example.practice.player.service.response.PlayerPracticeCreateResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public PlayerPracticeCreateResponseForm createPlayer(@ModelAttribute PlayerPracticeCreateRequestForm playerPracticeCreateRequestForm){
        PlayerPracticeCreateResponse response = playerPracticeService.create(playerPracticeCreateRequestForm.toPlayerPracticeCreateRequest());
        return PlayerPracticeCreateResponseForm.from(response);
    };

    @GetMapping("/list")
    public List<PlayerPractice> playerList(){
        return playerPracticeService.playerList();
    }
}
