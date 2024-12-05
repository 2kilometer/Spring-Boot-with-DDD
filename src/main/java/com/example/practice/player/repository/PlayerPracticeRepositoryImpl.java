package com.example.practice.player.repository;

import com.example.practice.game.entity.GamePractice;
import com.example.practice.game.repository.GamePracticeRepository;
import com.example.practice.player.entity.PlayerPractice;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Repository
public class PlayerPracticeRepositoryImpl implements PlayerPracticeRepository{
    final private GamePracticeRepository gamePracticeRepository;

    static List<PlayerPractice> playerList = new ArrayList<>();

    @Override
    public PlayerPractice createPlayer(String name) {
        PlayerPractice player = new PlayerPractice(name);
        playerList.add(player);
        return player;
    }

    @Override
    public List<Map<String, Object>> list() {
        List<Map<String, Object>> gameList = new ArrayList<>();
        for (int i = 0; i < playerList.size(); i++){

            Map<String, Object> playerDice = new HashMap<>();

            String playerName = playerList.get(i).getName();
            List<Map<String, Object>> diceList = new ArrayList<>();
            for (int j = 0; j <  3; j++){
                GamePractice game = gamePracticeRepository.createSimpleGame();
                Map<String, Object> gameResult = new HashMap<>();

                gameResult.put("number", game.getNumber());
                gameResult.put("id", game.getGameId());

                diceList.add(gameResult);
            }

            playerDice.put("id", i + 1);
            playerDice.put("name", playerName);
            playerDice.put("diceList", diceList);

            gameList.add(playerDice);
        }
        return gameList;
    }
}