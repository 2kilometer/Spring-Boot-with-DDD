package com.example.demo.player.controller;

import com.example.demo.player.controller.request_form.PlayerCreateRequestForm;
import com.example.demo.player.controller.response_form.PlayerCreateResponseForm;
import com.example.demo.player.service.PlayerService;
import com.example.demo.player.service.response.PlayerCreateResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/player")
public class PlayerController {
    final private PlayerService playerService;

    @GetMapping("/create")
    public PlayerCreateResponseForm createPlayer(@ModelAttribute PlayerCreateRequestForm playerCreateRequestForm) {
        log.info("createPlayer() called!");

        PlayerCreateResponse response = playerService.createPlayer(playerCreateRequestForm.toPlayerCreateRequest());
        return PlayerCreateResponseForm.from(response);
    }
}
