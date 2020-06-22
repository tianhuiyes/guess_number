package com.twschool.practice.domain;

import com.twschool.practice.repository.GameRepository;
import org.junit.Assert;
import org.junit.Test;

public class GameRepositoryTest {
    @Test
    public void should_create_game(){
        GameRepository gameRepository = new GameRepository();
        GuessNumberGame guessNumberGame = gameRepository.create();

        Assert.assertNotNull(guessNumberGame);
    }

    @Test
    public void should_find_game(){
        GameRepository gameRepository = new GameRepository();
        GuessNumberGame expectedguessNumberGame = gameRepository.create();
        GuessNumberGame guessNumberGame = gameRepository.find();

        Assert.assertNotNull(guessNumberGame);
        Assert.assertEquals(expectedguessNumberGame,guessNumberGame);
    }
}
