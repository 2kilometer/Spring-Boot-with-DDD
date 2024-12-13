package com.example.practice.player.service;

import com.example.practice.player.entity.PlayerPractice;
import com.example.practice.player.repository.PlayerPracticeRepository;
import com.example.practice.player.service.request.PlayerPracticeCreateRequest;
import com.example.practice.player.service.response.PlayerPracticeCreateResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Service
public class PlayerPracticeServiceImpl implements PlayerPracticeService{
    final private PlayerPracticeRepository playerPracticeRepository;

    @Override
    public PlayerPracticeCreateResponse create(PlayerPracticeCreateRequest playerPracticeCreateRequest) {
        PlayerPractice player = playerPracticeCreateRequest.toPlayer();
        PlayerPractice createdPlayer = playerPracticeRepository.save(player);

        return PlayerPracticeCreateResponse.from(createdPlayer);
    }

    @Override
    public List<PlayerPractice> playerList() {
        return playerPracticeRepository.findAll();
    }
}
