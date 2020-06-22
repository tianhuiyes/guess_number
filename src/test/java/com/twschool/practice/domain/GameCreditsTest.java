package com.twschool.practice.domain;

import org.junit.Assert;
import org.junit.Test;

public class GameCreditsTest {

    @Test
    public void should_return_3_when_getGredits_given_gameStatus_is_succeed(){
        //given
        GameStatus gameStatus =GameStatus.SUCCEED;
        GameCredits gameCredits = new GameCredits(gameStatus);

        //when
        int Credits = gameCredits.getCredits();

        //then
        Assert.assertEquals(3,Credits);

    }
}
