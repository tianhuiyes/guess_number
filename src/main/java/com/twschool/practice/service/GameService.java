package com.twschool.practice.service;

import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.repository.GameRepository;

public class GameService {

    private GameRepository gameRepository;


    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public String guess(String userAnswer) {
        GuessNumberGame guessNumberGame = gameRepository.find();
        String result = guessNumberGame.guess(userAnswer);
        return result;
    }
}
