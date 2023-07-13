package com.labturing.connect4server.models;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.labturing.connect4server.types.Color;

public class BoardBuilder {

    private List<String> rows;

    public BoardBuilder(){
        this.rows = new ArrayList<>();
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

    public Board build(){
        Board board = new Board();
        for (int i = 0; i < this.rows.size(); i++) {
            for (int j = 0; j < rows.get(i).length(); j++) {
                if(rows.get(i).charAt(0) == 'R'){
                    board.setColor(Color.RED, new Coordinate(i, j));
                } else if(rows.get(i).charAt(0) == 'Y'){
                    board.setColor(Color.YELLOW, new Coordinate(i, j));
                } else {
                    board.setColor(Color.NULL, new Coordinate(i, j));
                }  
            }
        }
        return board;
    }
    
}
