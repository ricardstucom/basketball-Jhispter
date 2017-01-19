package com.mycompany.myapp.service.dto;

import com.mycompany.myapp.domain.Game;

/**
 * Created by 46989075y on 13/01/2017.
 */
public class GameDTO {
    private Game game;
    private Double count;

    public GameDTO() {

    }

    public GameDTO(Game game, Double count) {
        this.game = game;
        this.count = count;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "GameDTO{" +
            "game=" + game +
            ", count=" + count +
            '}';
    }


}
