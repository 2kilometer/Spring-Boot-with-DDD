package com.example.demo.player.service;

import com.example.demo.player.entity.Player;
import com.example.demo.player.repository.PlayerRepository;
import com.example.demo.player.service.request.PlayerCreateRequest;
import com.example.demo.player.service.response.PlayerCreateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService{
    final private PlayerRepository playerRepository;

    @Override
    public PlayerCreateResponse createPlayer(PlayerCreateRequest playerCreateRequest) {
        Player player = playerCreateRequest.toPlayer();
        Player createdPlayer = playerRepository.save(player);

        return PlayerCreateResponse.from(createdPlayer);
    }
}
