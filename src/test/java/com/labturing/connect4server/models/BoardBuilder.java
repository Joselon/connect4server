package com.labturing.connect4server.models;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.labturing.connect4server.types.Color;

public class BoardBuilder {

    private List<String> rows;
    private Coordinate lastDrop;

    public BoardBuilder(){
        this.rows = new ArrayList<>();
        this.lastDrop = null;
    }

    //6 filas x 7 columnas
    public BoardBuilder rows(String... boardTokens){ 
        assert boardTokens.length == 6;
        for (String rowTokens : boardTokens) {
            assert Pattern.matches("[RY ]{7}", rowTokens);
            this.rows.add(rowTokens);
        }
        return this;
    }

    public BoardBuilder lastDrop(Coordinate lastDrop){
        this.lastDrop = lastDrop;
        return this;
    }

    public Board build(){
        Board board = new Board();
        for (int i = 0; i < this.rows.size(); i++) {
            for (int j = 0; j < rows.get(i).length(); j++) {
                if(rows.get(i).charAt(j) == 'R'){
                    board.setColor(Color.RED, new Coordinate(i, j));
                } 
                else if(rows.get(i).charAt(j) == 'Y'){
                    board.setColor(Color.YELLOW, new Coordinate(i, j));
                } else if (rows.get(i).charAt(j) == ' '){
                    board.setColor(Color.NULL, new Coordinate(i, j));
                }
            }
        }
        board.setLastDrop(this.lastDrop);
        return board;
    }
    
}
