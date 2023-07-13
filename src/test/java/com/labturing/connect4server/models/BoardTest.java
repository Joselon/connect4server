package com.labturing.connect4server.models;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BoardTest {
    
    private Board board;

    @Test
    public void createBoardFromBuilderTest(){
        this.board = new BoardBuilder().rows(
            "       ",
            "       ",
            "R      ",
            "R      ",
            "R      ",
            "R      "
        ).build();
        assertTrue(this.board.isGameFinished());
        assertTrue(this.board.isWinner());
        Coordinate lastDrop = new Coordinate(3,0);
        Direction direction = Direction.NORTH;
        //Line line = new Line(lastDrop, direction, Board.LINE_LENGTH);
        //assertTrue(this.board.isConnect4(line));
    }  
}
