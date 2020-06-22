package com.twschool.practice.api;

import com.twschool.practice.domain.AnswerGenerator;
import com.twschool.practice.domain.GameAnswer;
import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.service.GameService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GameController {
    @PostMapping("/game/guess_numbers")
    public Map<String,String> guess(@RequestBody Map<String,String> requestBody){
        GameService gameService = new GameService(new GuessNumberGame(new AnswerGenerator()));
        Map<String,String> responseBody = new HashMap<>();

        responseBody.put("input", requestBody.get("number"));
        responseBody.put("result",gameService.guess(requestBody.get("number")));

        return responseBody;
    }

}
