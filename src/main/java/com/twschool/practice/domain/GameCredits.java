package com.twschool.practice.domain;

import java.util.List;

public class GameCredits {
    private List<GameStatus> gameStatusList;
    public GameCredits(List<GameStatus> gameStatus) {
        this.gameStatusList = gameStatus;
    }

    public int getCredits() {
        int Credits = 0;
        int continueWinTimes = 0;
        for(int index = 0;index < gameStatusList.size();index++){
            if(GameStatus.SUCCEED.equals(gameStatusList.get(index))){
                Credits += 3;

            }else{
                Credits -=3;
            }
        }

        Credits += 2;
        return Credits;
    }
}
