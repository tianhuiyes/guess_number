package com.twschool.practice.domain;

public class GameCredits {
    private GameStatus gameStatus;
    public GameCredits(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getCredits() {
        int Credits = 0;
        if(GameStatus.SUCCEED.equals(gameStatus)){
            Credits += 3;
        }else if(GameStatus.FAILED.equals(gameStatus)){
            Credits -= 3;
        }
        return Credits;
    }
}
