package com.twschool.practice.domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.twschool.practice.domain.GameStatus.*;

public class GameCreditsTest {

    @Test
    public void should_return_3_when_getCredits_given_gameStatus_is_succeed(){
        //given
        List<GameStatus> gameStatusList = new ArrayList<GameStatus>(){{
            add(GameStatus.SUCCEED);
        }};
        GameCredits gameCredits = new GameCredits(gameStatusList);

        //when
        int Credits = gameCredits.getCredits();

        //then
        Assert.assertEquals(3,Credits);

    }

    @Test
    public void should_return_fu3_when_getCredits_given_gameStatus_is_failed(){
        //given
        List<GameStatus> gameStatusList = new ArrayList<GameStatus>(){{
            add(GameStatus.FAILED);
        }};
        GameCredits gameCredits = new GameCredits(gameStatusList);

        //when
        int Credits = gameCredits.getCredits();

        //then
        Assert.assertEquals(-3,Credits);

    }

    @Test
    public void should_return_11_when_getCredits_given_win_game_3_times_continuously(){
        //given
        List<GameStatus> gameStatusList = new ArrayList<GameStatus>(){{
            add(GameStatus.SUCCEED);
            add(GameStatus.SUCCEED);
            add(GameStatus.SUCCEED);
        }};
        GameCredits gameCredits = new GameCredits(gameStatusList);

        //when
        int Credits = gameCredits.getCredits();

        //then
        Assert.assertEquals(11,Credits);

    }
}
